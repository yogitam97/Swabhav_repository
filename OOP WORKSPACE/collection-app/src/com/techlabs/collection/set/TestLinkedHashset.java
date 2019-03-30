package com.techlabs.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestLinkedHashset {

	public static void main(String[] args) {
		Set<Student> set=new LinkedHashSet();
		Student s1=new Student(101,10,"A","B");
		Student s3=new Student(105,10,"A","B");
		Student s2=new Student(102,10,"A","B");
		set.add(s1);
		set.add(s3);
		set.add(s2);
		
		System.out.println(set.size());
	}

}
