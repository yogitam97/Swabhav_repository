package com.techlabs.composite.test;

import com.techlabs.composite.Employee;

public class TestEmployee {
	public static void main(String args[]) {
		Employee CEO = new Employee("John", "CEO", 30000);
		Employee Sales = new Employee("Robert", "Head Sales", 20000);
		Employee Marketing = new Employee("Michel", "Head Marketing", 20000);
		
		Employee clerk = new Employee("Bob","Marketing", 10000);
		
		CEO.add(Sales);
	    CEO.add(Marketing);
	    
	    Marketing.add(clerk);
	    System.out.println(CEO); 
	      
	      for (Employee headEmployee : CEO.getEmployees()) {
	         System.out.println(headEmployee);
	         
	         for (Employee employee : headEmployee.getEmployees()) {
	            System.out.println(employee);
	         }
	}
	}
}
