package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.Employee;
import com.techlabs.simplefactory.EmployeeFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee(30, 25.0);		 
        System.out.println(employee.getSalary());
 
        employee = EmployeeFactory.getEmployee(40, 15.45);
 
        System.out.println(employee.getSalary());
	}

}
