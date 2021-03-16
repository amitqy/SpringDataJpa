package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.CustomerRepository;
import com.example.dao.ProductRepository;
import com.example.entities.Customer;
import com.example.entities.Product;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Customer aCustomer1 = new Customer("Kapil");

		
		Product aProduct1 = new Product("Laptop");
		Product aProduct2 = new Product("GraphicCard");
		Product aProduct3 = new Product("ipad");
		
		List<Product> products1 = new ArrayList<>();
		
		products1.add(aProduct1);
		products1.add(aProduct2);
		products1.add(aProduct3);
		
		aCustomer1.setProducts(products1);
		
		productRepository.save(aProduct1);
		productRepository.save(aProduct2);
		productRepository.save(aProduct3);
		
		customerRepository.save(aCustomer1);

	
		
	}

}
