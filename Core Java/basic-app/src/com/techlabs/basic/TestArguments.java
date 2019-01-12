package com.techlabs.basic;

public class TestArguments {

	public static void main(String[] names) {
		System.out.println(names.length);
		if (names.length != 0) {
			for(String i:names) {
				System.out.println("Hello " + i);
			}
			System.out.println("Thanks");
		} else {
			System.out.println("Invalid input!Please enter more characters");
		}

	}

}
