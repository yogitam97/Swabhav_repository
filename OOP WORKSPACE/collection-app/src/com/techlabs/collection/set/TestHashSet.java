package com.techlabs.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Student> set=new HashSet();
		Student s1=new Student(101,10,"A","B");
		Student s2=new Student(101,10,"A","B");
		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
	
	}

}
