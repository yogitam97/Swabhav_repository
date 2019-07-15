package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class Employee{
	private int employeeID;
	private String employeeName;
	private String designation;
	private String managerID;
	private String dateOfJoining;
	private int salary;
	private String commision;
	private int dept_no;
	private int level = 0;
	private List<Employee> reportees;

	public Employee(int employeeID, String employeeName, String designation, String managerID, String dateOfJoining,
			int salary, String commision, int dept_no) {
System.out.println("employee");
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.designation = designation;
		this.managerID = managerID;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commision = commision;
		this.dept_no = dept_no;

	}

	public Employee() {
		reportees = new ArrayList();
	}

	public String toString() {
		return "" + employeeID + ",'" + employeeName + "','" + designation + "'," + managerID + ",'" + dateOfJoining
				+ "'," + salary + "," + commision + "," + dept_no;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<Employee> getReportees() {
		return reportees;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public String getManagerID() {
		return managerID;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public int getSalary() {
		return salary;
	}

	public String getCommision() {
		return commision;
	}

	public int getDept_no() {
		return dept_no;
	}

	public int getLevel() {
		return level;
	}

}