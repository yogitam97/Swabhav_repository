package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.Invoice;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(101,"Book",100,0.20f);
		invoice.print();
	}

}
