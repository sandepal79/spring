package com.alex.springmvcboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InitEmployees {

	List<Employee> empList = new ArrayList<>();

	public InitEmployees() {
		for (int i = 0; i < 5; i++) {
			empList.add(new Employee());
		}
	}

	public List<Employee> getEmpList() {
		return empList;
	}
}
