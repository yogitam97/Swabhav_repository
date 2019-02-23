package com.employee.polymorphism;

import java.util.Date;

public class Manager extends Employee {

	public Manager(String name, double basicSalary,String date) {
		super(name, basicSalary, date);
	}

	@Override
	public double calculateTotalSalary() {
		double salary = (0.50 * getbasicSalary() + 0.40 * getbasicSalary() + 0.30 * getbasicSalary()) + basicSalary;
		return salary;
	}

}
