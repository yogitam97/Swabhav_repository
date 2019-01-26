package com.techlabs.basic;

public class TestOverloading {
	public static void main(String args[]) {
		//before creating function
		System.out.println(10);
		System.out.println(5.5);
		System.out.println("Yogita");
		//after creating function
		printThis(10);
		printThis(11.3);
		printThis(10.5f);
		printThis('c');
		printThis(false);
		printThis("yogita");
		
	}
	//function overloading
	private static void printThis(int b) {
		System.out.println(b);
	}
	private static void printThis(float f) {
		System.out.println(f);
	}
	private static void printThis(double d) {
		System.out.println(d);
	}
	private static void printThis(char c) {
		System.out.println(c);
	}
	private static void printThis(boolean bo ) {
		System.out.println(bo);
	}
	private static void printThis(String s) {
		System.out.println(s);
	}
}