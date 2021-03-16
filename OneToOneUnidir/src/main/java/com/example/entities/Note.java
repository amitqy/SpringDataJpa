package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long noteId;
	String text;
	
	public Long getNoteId() {
		return noteId;
	}
	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}
	public void setNote(String text) {
		this.text = text;
	}
	public Note(String text) {
		super();
		this.text = text;
	}
	public Note() {
		super();
	}

}

