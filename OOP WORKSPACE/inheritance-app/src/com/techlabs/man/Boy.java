package com.techlabs.man;

public class Boy extends Man {
	public void eat() {
		System.out.println("Boy is eating");
	}

	@Override
	public void play() {
		System.out.println("Boy is playing");
	}

	public Boy() {
		super();
		System.out.println("Boy created");
	}
}
