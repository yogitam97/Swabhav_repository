package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String department;
	private int salary;
	private List<Employee> employees;

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		employees = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		employees.add(e);
	}

	public void remove(Employee e) {
		employees.remove(e);
	}
	  public List<Employee> getEmployees(){
		     return employees;
		   }

	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + department + ", salary :" + salary + " ]");
	}
}
