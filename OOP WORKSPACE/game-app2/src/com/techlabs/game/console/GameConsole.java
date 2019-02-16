package com.techlabs.game.console;

import java.util.Scanner;

import com.techlabs.game.*;

public class GameConsole {
	public static void main(String[] args){
	Game g = new Game();
	Scanner sc = new Scanner(System.in);
	String result;
	do {
		System.out.println("Enter any number from 1-100:");
		int num=sc.nextInt();
		result=g.guessTheNum(num);
		System.out.println("Result is:"+result);
		
		
	}while(!result.equalsIgnoreCase("perfect"));
	System.out.println("you guessed the no in"+g.getCount()+"attempts");

	}
}
