package com.alex.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

@RestController
public class EmployeeController {
	
	@Autowired
	BusinessLogic blogic;
	
	@GetMapping("/")
	public String about() {
		
		return "<h1>Employee List</h1>";
		
	}
	
	/*
	 * @GetMapping("/list") public List<Smartphone> findAll(){
	 * 
	 * 
	 * return blogic.getAll(); }
	 */
	
	
	@GetMapping("/one")
	public String findOne(){
		
		Faker faker = new Faker();		
		String s = faker.job().title() + '|' 
				+ faker.name().name() + '|' 
				+ faker.code().isbn13(false) + '|' 
				+ (int) Math.round(Float.parseFloat(faker.commerce().price().replace(',', '.'))*1000) + '|'
				+ faker.date().birthday(25, 50);
		
		;
		
		
		return s;
	}
	
	
}
