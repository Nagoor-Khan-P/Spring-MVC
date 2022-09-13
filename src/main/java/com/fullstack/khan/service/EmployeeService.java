package com.fullstack.khan.service;

import java.util.List;

import com.fullstack.khan.dto.Employee;

public interface EmployeeService {
	
	Employee getEmployeeById(int eid);
	
	List<Employee> getAllEmployee();
	void saveEmployee(Employee emp);

}
