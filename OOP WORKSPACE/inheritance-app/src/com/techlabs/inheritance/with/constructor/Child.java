package com.techlabs.inheritance.with.constructor;

public class Child extends Parent {
	public Child() {
		super(100);
	}

	public Child(int foo) {
		super(foo);
	}
}
