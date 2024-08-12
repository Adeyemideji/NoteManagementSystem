package org.example.data.repositories;

import org.example.data.models.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface NoteRepository extends MongoRepository<Note,String> {
}
