package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Note;
import com.example.entities.Person;
import com.example.repository.NoteRepository;
import com.example.repository.PersonRepository;


@SpringBootApplication
public class OneToOneUnidirApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneUnidirApplication.class, args);
	}
	@Autowired
    private PersonRepository personRepository;
	
	@Autowired
	private NoteRepository noteRepository;
	

	@Override
	public void run(String... args) throws Exception {
		

		Person aPerson1 = new Person("kapil");
		Person aPerson2 = new Person("Amit");
		Person aPerson3 = new Person("Suresh");
		
		Note aNote1 = new Note("Note is cool");
		Note aNote2 = new Note("Note is cool as fuck");
		Note aNote3 = new Note("This is the statue of liberty");
		
		noteRepository.save(aNote1);
		noteRepository.save(aNote2);
		noteRepository.save(aNote3);
		
		aPerson1.setNote(aNote1);
		aPerson2.setNote(aNote2);
		aPerson3.setNote(aNote3);
		
		personRepository.save(aPerson1);
		personRepository.save(aPerson2);
		personRepository.save(aPerson3);
		
	}
	
}
