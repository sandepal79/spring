package com.alex.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmartphoneController {
	
	@Autowired
	BusinessLogic blogic;
	
	@GetMapping("/")
	public String about() {
		
		return "<h1>Smartphone Inventory</h1>";
		
	}
	
	@GetMapping("/list")
	public List<Smartphone> findAll(){
		
		
		return blogic.getAll();
	}
	
	
	@GetMapping("/one")
	public Smartphone findOne(){
		
		
		return blogic.getOne();
	}
	
	
}
