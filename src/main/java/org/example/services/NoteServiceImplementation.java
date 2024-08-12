package org.example.services;

import org.example.data.models.Note;
import org.example.data.repositories.NoteRepository;
import org.example.requests.CreateNoteRequest;
import org.example.CreateNoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NoteServiceImplementation implements NoteService{
    @Autowired
    private NoteRepository noteRepository;
    @Override
    public CreateNoteResponse createNote(CreateNoteRequest createNoteRequest) {
        Note note = new Note();
        note.setContent(createNoteRequest.getNoteContent());
        note.setTitle(createNoteRequest.getNoteTitle());
        note.setDateAndTimeCreated(LocalDateTime.now());
        noteRepository.save(note);

        CreateNoteResponse response = new CreateNoteResponse();
        response.setMessage("Note created successfully");
        return response;
    }

    @Override
    public Long countNumberOfNote() {
        return noteRepository.count();
    }
}