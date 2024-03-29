package com.alex.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	Employee findByEmpId(Long empId);
	
}
