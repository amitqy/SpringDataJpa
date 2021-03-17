package com.example.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@ManyToMany
	/*In many to many a third table is created, which contains the primary keys of both
	the tables. Which act as f-key in that table
    */
	@JoinTable(name = "customer_employee",
	// In the other table, this table will contribute its primary key (id) as f-key
	// and its name will be "product_id" in the table
	joinColumns = @JoinColumn(name = "product_id") , 
   // other table's f-key in the other table will be called as "customer_id"
	inverseJoinColumns = @JoinColumn(name = "customer_id"))
    List<Customer>customers;
	public Product(String name) {
		super();
		this.name = name;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = new ArrayList<>();
		this.customers = customers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product() {
		super();
	}
	
}
