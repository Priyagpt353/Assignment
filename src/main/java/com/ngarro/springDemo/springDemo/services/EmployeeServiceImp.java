package com.ngarro.springDemo.springDemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ngarro.springDemo.springDemo.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{

	List<Employee> list;
	
	public EmployeeServiceImp() {
		list = new ArrayList<Employee>();
		list.add(new Employee(101,"Priya","IT","Gorakhpur"));
		list.add(new Employee(102,"Sneha","HR","Lucknow"));
		list.add(new Employee(103,"Gaurav","Accounts","Kanpur"));
	}
	
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return list;
	}

}
