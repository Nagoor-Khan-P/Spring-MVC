package com.fullstack.khan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fullstack.khan.dto.Employee;
import com.fullstack.khan.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping
	public String showRegister(Model model) {
		model.addAttribute("employee", new Employee());
		return "register";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveEvployee(@RequestParam int eid, @RequestParam String ename, @RequestParam String email,
			@RequestParam String city) {
		Employee emp=new Employee();
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setEmail(email);
		emp.setCity(city);
		employeeService.saveEmployee(emp);
		return "success";
	}
}
