package com.techlabs.interfacePolymorphism;

public class Man implements IMannerable{

	@Override
	public void wish() {
		System.out.println("Man is wishing hii!!");
	}

	@Override
	public void depart() {
		System.out.println("Man is departing good bye!!!");
	}
	
	public void read() {
		System.out.println("Man is reading");
	}
	

}
