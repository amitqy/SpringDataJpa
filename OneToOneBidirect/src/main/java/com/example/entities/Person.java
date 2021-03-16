package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long personId;
	String name;
	@OneToOne
	// Note is the child and its parent Person is referring to noteId property of Notes  
	@JoinColumn(name="note_id", referencedColumnName= "noteId")
	Note note;
	public Person( String name) {
		super();
		this.name = name;
	}
	public Person() {
		super();
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNote(Note note) 
	{
		this.note = note;
	}
}
