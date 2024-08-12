package org.example.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class Note {
    @Id
    private String id;
    private String title;
    private String content;
    private LocalDateTime dateAndTimeCreated;
}
