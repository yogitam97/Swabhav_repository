package com.techlabs.exception;

public class ExceptionStackTest {

	public static void main(String[] args) {
		try {
		m1();
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}
	public static void m1() throws Exception {
		System.out.println("Inside m1");
		m2();
	}
	public static void m2() throws Exception {
		System.out.println("Inside m2");
		m3();
	}
	public static void m3() throws Exception {
		System.out.println("Inside m3");
		throw new Exception("error in m3");
	}

}
