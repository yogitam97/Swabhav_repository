package com.techlabs.simplefactory;

public class FullTimeEmployee implements Employee {
	private double Salary;

	public FullTimeEmployee(double Salary) {
		this.Salary = Salary;
	}

	@Override
	public double getSalary() {
		return Salary;
	}
}
