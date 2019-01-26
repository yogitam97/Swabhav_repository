package com.techlabs.employee;

public class Employee {
	private String firstname;
	private String lastname;
	private static int nextEmpno;
	private int empno;
	static {
		nextEmpno = 100;
	}

	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.empno = nextEmpno++;
	}

	public int getEmpno() {
		return empno;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

}
