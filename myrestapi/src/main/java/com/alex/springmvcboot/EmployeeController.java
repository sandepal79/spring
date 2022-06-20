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

import com.alex.springmvcboot.exception.RecordNotFoundException;


@RestController
public class EmployeeController {

	@Autowired
	BusinessLogic blogic;

	@GetMapping("/about")
	public String about() {
		return "<h1>Employee List</h1>";
	}

	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> findAll() {
		
		List<Employee> empList = blogic.getEmpList();
		
		if (empList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(empList, HttpStatus.OK);
		}
	}

	@GetMapping("/employee/{empid}")
	public ResponseEntity<Employee> findOne(@PathVariable String empid) {

		Employee employee = blogic.getEmp(Long.parseLong(empid));

		if (employee == null) {			
			throw new RecordNotFoundException("Invalid employee id : " + empid);
		} else {
			return new ResponseEntity<>(employee, HttpStatus.OK);
		}
		
	}

	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmp(@RequestBody Employee emp) {
			

		 try {
			 Employee employee = blogic.addEmp(emp);
		      return new ResponseEntity<>(employee, HttpStatus.CREATED);
		    } catch (Exception e) {
		    	e.printStackTrace();
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		 		
	}

	@PutMapping("/employee/{empid}")
	public ResponseEntity<Employee> updateEmp(@PathVariable String empid, @RequestBody Employee empObj) {
		
		return new ResponseEntity<>(blogic.updateEmp(Long.parseLong(empid), empObj), HttpStatus.OK);
	}

	@DeleteMapping("/employee/{empid}")
	public ResponseEntity<Object> delEmp(@PathVariable String empid) {
		blogic.deleteEmp(Long.parseLong(empid));
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

}
