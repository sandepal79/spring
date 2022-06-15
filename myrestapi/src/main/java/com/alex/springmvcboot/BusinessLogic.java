package com.alex.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogic {

	@Autowired
	InitEmployees initemp;

	public BusinessLogic() {
	}

	public List<Employee> getEmpList() {
		return initemp.getEmpList();
	}

	public void addEmp(Employee emp) {
		initemp.empList.add(
				new Employee(emp.getEmpId(), emp.getName(), emp.getJobTitle(), emp.getSalary(), emp.getBirthDate()));
	}

}
