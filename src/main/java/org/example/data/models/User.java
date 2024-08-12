package org.example.data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;
@Setter
@Getter
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private List<Note> noteList;
}
