package com.techlabs.collection.set;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
	private int roll_no;
	private int standard;
	private String firstName;
	private String lastName;

	public Student(int roll_no, int standard, String firstName, String lastName) {
		this.roll_no = roll_no;
		this.standard = standard;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public int getStandard() {
		return standard;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;
		return roll_no == student.roll_no && standard == student.standard;
	}

	@Override
	public int hashCode() {
		return this.roll_no;
	}

	@Override
	public String toString() {
		return " " + roll_no + " " + standard + " "
	+ firstName + " " + lastName;
	}

	@Override
	public int compareTo(Student student) {
		return firstName.compareTo(student.getFirstName())|
				lastName.compareTo(student.getLastName());
	}
	
}
