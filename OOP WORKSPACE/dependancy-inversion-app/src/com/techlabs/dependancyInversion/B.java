package com.techlabs.dependancyInversion;

public class B implements Iinvertor{
	public void foo(B b) {
		System.out.println("inside of class B");
	}
}
