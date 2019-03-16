package com.techlabs.dependancyInversion;

public class A {
	public static void main(String[] args) {
		A a=new A();
		Iinvertor x;
		x=(Iinvertor)new A();
		//x.foo(a);
	}
}
