package com.techlabs.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumGame {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	private int num = rand.nextInt(100);
	private int userNum=0;
	private static int noOfGuesses;
	static {
		noOfGuesses = 0;
	}

	public void guessNum(int userNum) {
		 while (userNum != num) {
		        userNum = sc.nextInt();
		        noOfGuesses++;
		        if (userNum < num) {
		            System.out.println("lower!");
		        } else if (userNum > num) {
		            System.out.println("higher!");
		        }
		    }
		    System.out.println("Congratulations. You guessed the number with "
		        +noOfGuesses+ " tries!");
	}

	public int getnum() {
		return num;
	}

	public static int getnoOfGuesses() {
		return noOfGuesses;
	}

}
