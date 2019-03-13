package com.techlabs.interfaceCrud;

public class InvoiceDb implements ICrudable{

	@Override
	public void create() {
		System.out.println("Adding to InvoiceDB");
	}

	@Override
	public void read() {
		System.out.println("Reading to InvoiceDB");
	}

	@Override
	public void update() {
		System.out.println("Updating to InvoiceDB");
	}

	@Override
	public void delete() {
		System.out.println("Deleting to InvoiceDB");
	}
	

}
