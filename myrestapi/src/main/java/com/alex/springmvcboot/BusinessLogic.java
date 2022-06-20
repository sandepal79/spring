package com.alex.springmvcboot;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BusinessLogic {

	@Autowired
	EmployeeRepository empRepository;
	


	public BusinessLogic() {
	}

	public List<Employee> getEmpList() {
		return empRepository.findAll();
	}
	
	public Employee getEmp(Long empid) {
		return empRepository.findByEmpId(empid);
	}

	public Employee addEmp(Employee emp) {
		return empRepository.save(emp);
	}

	public Employee updateEmp(Long empid, Employee emp) {
				
		Employee emprepo = empRepository.findByEmpId(empid);
		
		emprepo.setEmpId(emp.getEmpId());
		emprepo.setName(emp.getName());
		emprepo.setJobTitle(emp.getJobTitle());
		emprepo.setSalary(emp.getSalary());
		emprepo.setBirthDate(emp.getBirthDate());
		
		return empRepository.save(emp);	

	}

	public void deleteEmp(Long empid) {

		Employee emprepo = empRepository.findByEmpId(empid);		
		empRepository.delete(emprepo);

	}

}
