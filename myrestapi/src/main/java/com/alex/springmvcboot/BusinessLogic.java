package com.alex.springmvcboot;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	
	public List<Employee> getEmp(String empid) {
		return initemp.empList.stream().filter(i -> empid.equals(i.getEmpId())).collect(Collectors.toList());
	}

	public void addEmp(Employee emp) {
		initemp.empList.add(
				new Employee(emp.getEmpId(), emp.getName(), emp.getJobTitle(), emp.getSalary(), emp.getBirthDate()));
	}

	public void updateEmp(String empid, Employee emp) {
		Stream<Employee> str = initemp.empList.stream();
		if (str.noneMatch(i -> empid.equals(i.getEmpId()))) {
			System.out.println("No match");
		} else {
			str.filter(i -> empid.equals(i.getEmpId())).forEach(i -> {
				i.setName(emp.getName());
				i.setJobTitle(emp.getJobTitle());
				i.setSalary(emp.getSalary());
				i.setBirthDate(emp.getBirthDate());
			});
		}

	}

	public void deleteEmp(String empid) {

		Stream<Employee> str = initemp.empList.stream();
		if (str.noneMatch(i -> empid.equals(i.getEmpId()))) {
			System.out.println("No match");
		} else {
			initemp.empList.removeIf(i -> empid.equals(i.getEmpId()));
		}

	}

}
