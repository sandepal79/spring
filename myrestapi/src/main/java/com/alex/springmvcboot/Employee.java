package com.alex.springmvcboot;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String empId;
	private String name;	
	private String jobTitle;
	private int salary;
	private Date birthDate;
	
	
	public Employee() {
		
	}
	
	public Employee(String empId, String name, String jobTitle, int salary, Date date) {
		this.empId = empId;
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.birthDate = date;
	}
	
	
		
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
	
}
