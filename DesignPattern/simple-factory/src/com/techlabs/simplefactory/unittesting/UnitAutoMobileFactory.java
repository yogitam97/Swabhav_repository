package com.techlabs.simplefactory.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.simplefactory.AutoMobileFactory;
import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.IAutomobile;

public class UnitAutoMobileFactory {
	@Test
	public void checkWhichInstanceIsCraeted() {
		AutoMobileFactory factory = AutoMobileFactory.getInstance();
		IAutomobile auto = factory.make(AutoType.AUDI);
		String expected="Audi";
		assertEquals(expected.toLowerCase(),auto.getClass().getSimpleName().toLowerCase());
	}
}
