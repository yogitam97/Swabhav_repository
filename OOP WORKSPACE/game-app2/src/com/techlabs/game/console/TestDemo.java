package com.techlabs.game.console;

import java.util.Scanner;

public class TestDemo {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int count = 0;
	    int a = 1 + (int) (Math.random() * 99);
	    int guess = 0;

	    System.out.println("Enter any number:");

	    while (guess != a) {
	        guess = sc.nextInt();
	        count++;
	        if (guess > a) {
	            System.out.println("lower!");
	        } else if (guess < a) {
	            System.out.println("higher!");
	        }
	    }
	    System.out.println("Congratulations. You guessed the number with "
	        + count + " tries!");
	}
}
