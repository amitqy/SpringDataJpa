package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Note;

public interface NoteRepository extends CrudRepository<Note,Long> {

}

