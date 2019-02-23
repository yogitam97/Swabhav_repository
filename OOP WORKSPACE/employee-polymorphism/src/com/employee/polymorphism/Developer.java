package com.employee.polymorphism;

import java.util.Date;

public class Developer extends Employee {

	public Developer(String name, double basicSalary, String date) {
		super(name, basicSalary, date);
	}

	@Override
	public double calculateTotalSalary() {
		double salary = (0.30 * basicSalary) + basicSalary;
		return salary;
	}

}
