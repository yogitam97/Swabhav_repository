package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.Invoice;
import com.techlabs.srp.solution.InvoiceConsolePrinter;

public class TestSolution {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(101,"Book",100,0.20f);
		InvoiceConsolePrinter ip=new InvoiceConsolePrinter();
		ip.print(invoice);
		
	}

}
