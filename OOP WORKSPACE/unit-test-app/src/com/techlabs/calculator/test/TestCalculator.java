package com.techlabs.calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.calculator.Calculator;

public class TestCalculator {
	@Test
	public void shouldBeCubing2with8(){
		Calculator calculator=new Calculator();
		int no=4;
		int actual=calculator.cubeEvenNo(no);
		int expected=no*no*no;
		assertEquals(expected, actual);
		
	}
}
