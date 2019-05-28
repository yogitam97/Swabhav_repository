package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.AutoMobileFactory;
import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.IAutomobile;

public class TestAutoMobileFactory {

	public static void main(String[] args) {
		AutoMobileFactory factory=AutoMobileFactory.getInstance();
		IAutomobile auto=factory.make(AutoType.BMW);
		//System.out.println(auto.getClass().getSimpleName());
		
		auto.start();
		auto.stop();
	}

}
