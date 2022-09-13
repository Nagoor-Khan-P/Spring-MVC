package com.fullstack.khan.dao;

import java.util.List;

import com.fullstack.khan.dto.Employee;

public interface EmployeeDao {

	Employee getEmployeeById(int eid);

	List<Employee> getAllEmployee();

	void saveEmployee(Employee emp);
}
