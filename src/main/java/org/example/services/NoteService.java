package org.example.services;

import org.example.requests.CreateNoteRequest;
import org.example.CreateNoteResponse;
import org.springframework.stereotype.Service;

@Service
public interface NoteService {


    CreateNoteResponse createNote(CreateNoteRequest createNoteRequest);

    Long countNumberOfNote();
}
