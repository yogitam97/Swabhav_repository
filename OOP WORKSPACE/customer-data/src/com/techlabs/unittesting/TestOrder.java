package com.techlabs.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.lineitem.LineItem;
import com.techlabs.order.Order;
import com.techlabs.product.Product;

public class TestOrder {
	@Test
	public void checkDateOfOrder() {
		Product product=new Product(101,"Book",0.20f,100);
		LineItem lineitem=new LineItem(1,2,product);
		Order order=new Order();
		order.addLineItem(lineitem);
		
		String actualName=lineitem.getProduct().getName();
		String expectedName="Book";
		
		assertEquals(actualName,expectedName);
	}
}
