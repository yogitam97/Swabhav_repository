package com.techlabs.simplefactory;

class Audi implements IAutomobile{

	@Override
	public void start() {
		System.out.println("Audi started");
	}

	@Override
	public void stop() {
		System.out.println("Audi stopped");
	}

}
