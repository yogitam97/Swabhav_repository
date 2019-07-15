package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Employee;
import com.techlabs.repository.EmployeeRepository;

public class EmployeeService {
	EmployeeRepository er=new EmployeeRepository();
	private List<Employee> emp=new ArrayList();
	
	public List getData() {
		er.loadData();
		emp=er.getEmployees();
		System.out.println(emp);
		return er.getEmployees();
	}
}
