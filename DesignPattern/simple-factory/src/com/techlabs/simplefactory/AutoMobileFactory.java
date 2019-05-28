package com.techlabs.simplefactory;

public class AutoMobileFactory {
	private static AutoMobileFactory factory;
	private AutoType autotype;
	private IAutomobile obj;
	private AutoMobileFactory() {
		
	}
	public static AutoMobileFactory getInstance() {
		if(factory==null)
			return new AutoMobileFactory();
		return factory;
	}
	public IAutomobile make(AutoType autotype) {
		if(autotype==autotype.BMW)
			return new BMW();
		if(autotype==autotype.TESLA)
			return new Tesla();
		return new Audi();
	}
}
