package com.alex.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/select")
	public List<Employee> findAll() {
		return blogic.getEmpList();
	}

	@GetMapping("/select/{empid}")
	public ResponseEntity<Employee> findOne(@PathVariable String empid) {

		List<Employee> empList = blogic.getEmp(empid);

		if (empList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(empList.get(0), HttpStatus.OK);
		}

	}

	@PostMapping("/upsert")
	public void addEmp(@RequestBody Employee emp) {
		blogic.addEmp(emp);
		return;
	}

	@PutMapping("/upsert/{empid}")
	public void updateEmp(@PathVariable String empid, @RequestBody Employee empObj) {
		blogic.updateEmp(empid, empObj);
		return;
	}

	@DeleteMapping("/delete/{empid}")
	public void delEmp(@PathVariable String empid) {
		blogic.deleteEmp(empid);
		return;
	}

}
