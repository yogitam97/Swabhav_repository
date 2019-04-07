package com.techlabs.srp.solution;

public class InvoiceConsolePrinter {
	public void print(Invoice invoice) {
		System.out.println("id: "+invoice.getId()+" name: "+invoice.getName()+
				" total cost: "+invoice.finalCost());
	}
	

}
