package com.techlabs.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.customer.Customer;

public class TestCustomer {
	@Test
	public void checkIdOfAddedCustomer() {
		Customer customer=new Customer("shekhar","dombivali");
		
		int actualId=customer.getId();
		int expectedId=1;
		
		assertEquals(actualId,expectedId);
	}
}
