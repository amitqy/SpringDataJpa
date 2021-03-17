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
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@ManyToMany
	/*In many to many a third table is created, which contains the primary keys of both
	the tables. Which act as f-key in that table.
    */
	@JoinTable(name = "customer_employee",
	// In the other table, this table will contribute its primary key (id) as f-key
	// and its name will be "customer_id" in the table
	joinColumns = @JoinColumn(name = "customer_id") ,
	// other table's f-key in the other table will be called as "product_id"
	inverseJoinColumns = @JoinColumn(name = "product_id"))
	List<Product>products ;
	public String getName() {
		return name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = new ArrayList<>();
		this.products = products;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(String name) {
		super();
		this.name = name;
	}
	public Customer() {
		super();
	}
	
	

}
