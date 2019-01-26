package com.techlabs.student;

public class Student {
	final private int rollno;
	final private String name;
	final private int age;
	private static int count;
	static {
		count=100;
		System.out.println("Inside static block");
	}

	public Student(int rollno, String name, int age) {
		System.out.println("Inside constructor");
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.count++;
	}

	public Student(int rollno, String name) {
		this(rollno, name, 18);
	}
	
	public Student whoIsElder(Student student) {
		if (this.age > student.age)
			return this;
		return student;

	}
	public static int headCount() {
		return count;
	}
	public int getCount() {
		return count;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
