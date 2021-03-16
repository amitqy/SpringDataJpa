package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Person;

public interface PersonRepository extends CrudRepository<Person,Long> {

}