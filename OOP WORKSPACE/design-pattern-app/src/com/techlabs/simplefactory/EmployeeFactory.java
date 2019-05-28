package com.techlabs.simplefactory;

public class EmployeeFactory {
	public static Employee getEmployee(int hoursAlloted,double salary) {
		if(hoursAlloted>40) {
			return new FullTimeEmployee(30000);
		}
		else {
			return new PartTimeEmployee(30000);
		}
		
	}
}
