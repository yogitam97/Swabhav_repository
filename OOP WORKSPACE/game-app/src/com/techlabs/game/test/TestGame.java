package com.techlabs.game.test;
import java.util.Scanner;

import com.techlabs.game.*;

public class TestGame {
	public static void main(String args[]) {
		GuessNumGame num=new GuessNumGame();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int userNum=sc.nextInt();
		num.guessNum(userNum);
		
	   
	}

}
