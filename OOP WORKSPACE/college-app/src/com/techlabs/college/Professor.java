package com.techlabs.college;

public class Professor extends Person implements SalariedEmployee{
	private double salary;
	private double pa=0.20f;
	public Professor(int id, String address, String dob,double salary) {
		super(id, address, dob);
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public double calculateSalary() {
		salary=salary*pa+salary;
		return salary;
	}
	
}
