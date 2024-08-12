package org.example.services;

import org.example.CreateNoteResponse;
import org.example.requests.CreateNoteRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NoteServiceImplementationTest {

    @Autowired
    private  NoteService noteService;



    @Test
    public void testThatNoteCanBeCreated(){
        CreateNoteRequest createNoteRequest = new CreateNoteRequest();
        createNoteRequest.setNoteTitle("Bad Afeez");
        createNoteRequest.setNoteContent("Bad Afeez is deji friend");
        createNoteRequest.setDateAndTimeCreated(LocalDateTime.now());
        CreateNoteResponse response = noteService.createNote(createNoteRequest);
        assertThat(response).isNotNull();
        assertThat(response.getMessage()).contains("Note created successfully");
        assertEquals(1,noteService.countNumberOfNote());
    }
}