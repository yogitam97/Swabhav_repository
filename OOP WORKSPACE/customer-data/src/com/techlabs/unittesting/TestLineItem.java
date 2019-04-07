package com.techlabs.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.lineitem.LineItem;
import com.techlabs.product.Product;

public class TestLineItem {
	@Test
	public void checkIfQuantityIsIncreased() {
	Product p1=new Product(101,"Book",0.20f,100);
	LineItem l1=new LineItem(1,2,p1);
	String actualName=l1.getProduct().getName();
	String expectedName="Book";
	
	assertEquals(actualName,expectedName);
		
	}

}
