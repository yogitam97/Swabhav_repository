package com.techlabs.student.test;

import com.techlabs.student.*;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student(101, "A", 20);
		printDetails(student);
		Student student2 = new Student(102, "B");
		printDetails(student2);
		student.getCount();
		student2.getCount();
		
		Student elder = student.whoIsElder(student2);
		printDetails(elder);
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(elder.hashCode());
	}

	public static void printDetails(Student s) {
		System.out.println("Roll no:" + s.getRollno() + 
				" Name :" + s.getName() + " age:" + s.getAge()+
				" count:"+s.getCount());
	}

}
