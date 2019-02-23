package com.techlabs.testInhertance;

import com.techlabs.man.*;

public class TestInheritance {

	public static void main(String[] args) {
		// case1();
		// case2();
		// case3();
		// case4();
		case5();
	}

	public static void case1() {
		Man x;
		x = new Man();
		x.read();
		x.play();
		x.walk();
	}

	public static void case2() {
		Boy y;
		y = new Boy();
		y.read();
		y.eat();
		y.play();
		y.walk();
	}

	public static void case3() {
		Man x;
		x = new Boy();
		x.read();
		x.play();
		x.walk();
	}

	public static void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Child());
	}

	public static void case5() {
		Object x;
		x = 10;
		x = "Yogita";
		x = true;
		System.out.println(x);
	}

	public static void atThePark(Man x) {
		System.out.println("At the park!!");
		x.play();
	}

}
