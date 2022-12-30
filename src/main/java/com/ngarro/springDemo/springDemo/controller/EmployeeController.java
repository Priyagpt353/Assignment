package com.ngarro.springDemo.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngarro.springDemo.springDemo.model.Employee;
import com.ngarro.springDemo.springDemo.services.EmployeeService;
//import com.ngarro.springDemo.springDemo.services.EmployeeServiceImp;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home() {
		return "This is home";
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeService.getEmployee();
	}
}
