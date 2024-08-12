package org.example.requests;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class CreateNoteRequest {

    private String noteTitle;
    private String noteContent;
    private LocalDateTime dateAndTimeCreated;

}
