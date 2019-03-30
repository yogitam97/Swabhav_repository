package com.techlabs.treeset;

import java.util.Collections;
import java.util.TreeSet;

import com.techlabs.collection.set.Student;

public class TestTreesetComparator {

	public static void main(String[] args) {
		TreeSet<Student> treeset=new TreeSet<Student>(new SortUsingFirstName());
		treeset.add(new Student(101,10,"Yogita","More"));
		treeset.add(new Student(102,10,"Abhishek","Londhe"));
		treeset.add(new Student(103,10,"Abhishek","Jadhav"));
		treeset.add(new Student(104,10,"Pranjal","Khule"));
		
		for(Student s:treeset)
			System.out.println(s);
	}

}
