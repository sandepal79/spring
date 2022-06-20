package com.alex.springmvcboot;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity
@NoArgsConstructor
@Table(name = "employee_details")

public class Employee {

	@Id
	@Column(name = "emp_id")
	@NonNull
	private Long empId;
	
	@Column(name = "name")
	@NonNull
	private String name;
	
	@Column(name = "job_title")
	@NonNull
	private String jobTitle;
	
	@Column(name = "salary")
	@NonNull
	private int salary;
	
	@Column(name = "birth_date")
	@NonNull
	private Date birthDate;
	

	public Employee() {		
	}


	public Employee(@NonNull Long empId, @NonNull String name, @NonNull String jobTitle, @NonNull int salary,
			@NonNull Date birthDate) {
		this.empId = empId;
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.birthDate = birthDate;
	}


	public Long getEmpId() {
		return empId;
	}


	public void setEmpId(Long empId) {
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
