package com.alex.springmvcboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;

import java.sql.Date;


@SpringBootApplication
public class MyRestAPIApplication {
	
	@Autowired
	Employee emp;
	
	public static void main(String[] args) {
		SpringApplication.run(MyRestAPIApplication.class, args);
		
		
		List<Employee> empList = new ArrayList<>();
		
		Faker faker = new Faker();	
		empList.add(new Employee(faker.code().isbn13(false), 
				faker.name().name(), 
				faker.job().title(), 
				(int) Math.round(Float.parseFloat(faker.commerce().price().replace(',', '.'))*1000), 
				new java.sql.Date(faker.date().birthday(25, 50).getTime()) ));
		
		System.out.println(empList.get(0).getBirthDate());
		
		
	
		
		
	}
	
	
	

}
