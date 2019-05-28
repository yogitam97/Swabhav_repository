package com.techlabs.simplefactory;

public class PartTimeEmployee implements Employee {
	private double Salary;

	public PartTimeEmployee(double Salary) {
		this.Salary = Salary;
	}

	@Override
	public double getSalary() {
		return Salary;
	}
}
