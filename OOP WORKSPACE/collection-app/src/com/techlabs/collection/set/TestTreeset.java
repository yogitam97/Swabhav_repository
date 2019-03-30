package com.techlabs.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeset {

	public static void main(String[] args) {
		Set<Student> set=new TreeSet();
		Student s1=new Student(101,10,"A","B");
		Student s3=new Student(105,10,"A","B");
		Student s2=new Student(102,10,"A","B");
		set.add(s1);
		set.add(s3);
		set.add(s2);
		System.out.println(set.size());
		System.out.println(set);

	}

}
