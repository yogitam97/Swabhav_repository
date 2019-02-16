package com.techlabs.game;

import java.util.Random;

public class Game {
	Random rand = new Random();
	private int num = rand.nextInt(100);
	private static int count=0;
	
	public String guessTheNum(int userNum) {
		count++;
		if(userNum==num) {
			return "perfect";
		}
		if(userNum<num) {
			return "lower";
		}
		return "higher";
	}
	public int getCount() {
		return count;
	}

}
