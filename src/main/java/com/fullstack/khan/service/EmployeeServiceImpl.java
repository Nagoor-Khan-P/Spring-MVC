package com.fullstack.khan.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fullstack.khan.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private List<Employee> listOfEmployees;
	
	public EmployeeServiceImpl() {
		listOfEmployees=new ArrayList<>();
	}

	public EmployeeServiceImpl(List<Employee> listOfEmployees) {
		super();
		this.listOfEmployees = listOfEmployees;
	}

	 @Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return listOfEmployees;
	}

	@Override
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		listOfEmployees.add(emp);
		
	}

}
