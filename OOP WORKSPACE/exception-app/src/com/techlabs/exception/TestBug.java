package com.techlabs.exception;

public class TestBug {
	//private static int count=0;
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		//count++;
		System.out.println("result is:"+c);
		System.out.println("thank you");
		//System.out.println(count);
		//main(args);
	}

}
