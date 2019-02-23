package com.inheritance.constructor.test;

import com.techlabs.inheritance.with.constructor.Child;

public class TestInheritanceConstructor {

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.getfoo());
		Child c2 = new Child();
		System.out.println(c2.getfoo());
		Child c3 = new Child(200);
		System.out.println(c3.getfoo());
		Child c4 = new Child(300);
		System.out.println(c4.getfoo());
	}

}
