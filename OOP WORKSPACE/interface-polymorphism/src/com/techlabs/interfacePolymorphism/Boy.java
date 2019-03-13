package com.techlabs.interfacePolymorphism;

public class Boy implements IMannerable,IEmotionable{

	@Override
	public void cry() {
		System.out.println("Boy is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Boy is laughing");
	}

	@Override
	public void wish() {
		System.out.println("Boy is wishing hello!");
	}

	@Override
	public void depart() {
		System.out.println("Boy is departing good bye!");
	}

}
