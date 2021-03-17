package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long>{

}
