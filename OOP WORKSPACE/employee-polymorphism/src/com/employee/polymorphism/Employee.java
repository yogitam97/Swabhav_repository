package com.employee.polymorphism;

import java.util.Date;

public abstract class Employee {
	private String name;
	protected double basicSalary;
	private String date;
	private static int nextEmpno;
	private int empno;
	static {
		nextEmpno = 100;
	}

	public Employee(String name, double basicSalary,String date) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.empno = nextEmpno++;
		this.date=date;
	}

	abstract public double calculateTotalSalary();

	public int getempno() {
		return empno;
	}

	public String getname() {
		return name;
	}

	public double getbasicSalary() {
		return basicSalary;
	}
	public String getdate() {
		return date;
	}
}
