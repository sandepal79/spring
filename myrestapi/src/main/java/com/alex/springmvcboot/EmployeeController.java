package com.alex.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	BusinessLogic blogic;

	@GetMapping("/")
	public String about() {
		return "<h1>Employee List</h1>";
	}

	@GetMapping("/list")
	public List<Employee> findAll() {
		return blogic.getEmpList();
	}

	@GetMapping("/one")
	public Employee findOne() {
		return blogic.getEmpList().get(0);
	}

	@PostMapping("/")
	public void addEmp(@RequestBody Employee emp) {
		blogic.addEmp(emp);
		return;
	}

}
