package com.dependancy.case2.business;

import com.dependancy.case2.core.*;

public class A {
	IFooable obj;

	public A(IFooable obj) {
		this.obj = obj;
	}

	public void bar() {
		System.out.println("Inside bar");
		obj.foo();
	}
}
