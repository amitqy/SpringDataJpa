package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long noteId;
	String text;
	// Note is the child and its parent is Person. Person is using fkey "note" to make a mapping
	@OneToOne(mappedBy = "note")
	Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
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

