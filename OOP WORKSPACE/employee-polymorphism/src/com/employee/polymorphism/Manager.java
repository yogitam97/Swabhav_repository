package com.employee.polymorphism;

public class Manager extends Employee {
	private double hra=0.50;
	private double da=0.40;
	private double ta=0.30;

	public Manager(String name, double basicSalary, String date) {
		super(name, basicSalary, date);
	}

	@Override
	public double calculateTotalSalary() {
		double salary = (hra * getbasicSalary() + da * getbasicSalary() + ta * getbasicSalary()) + basicSalary;
		return salary;
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTa() {
		return ta;
	}

	@Override
	public String structureOfSalary() {
		return "hra = 50% \n da = 40% \n ta = 30%";
		
	}
	

}
