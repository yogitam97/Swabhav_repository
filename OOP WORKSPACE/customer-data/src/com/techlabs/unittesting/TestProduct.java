package com.techlabs.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.product.Product;

public class TestProduct {
	@Test
	public void checkTheTotalCostOfTheProductAfterAddedDiscount() {
		Product product=new Product(101,"Book",0.20f,100);
		product.calculateTotalCost();
		double actualCost=product.getTotalCost();
		double expectedCost=80;
		
		assertEquals(actualCost,expectedCost);
	}
}
