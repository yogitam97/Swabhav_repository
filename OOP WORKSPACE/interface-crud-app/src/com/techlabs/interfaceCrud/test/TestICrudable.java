package com.techlabs.interfaceCrud.test;

import com.techlabs.interfaceCrud.*;

public class TestICrudable {

	public static void main(String[] args) {
		ICrudable x;
		x = new InvoiceDb();
		doDBOperations(x);
		x = new OrderDb();
		doDBOperations(x);
		x = new CustomerDb();
		doDBOperations(x);
	}

	public static void doDBOperations(ICrudable x) {
		x.create();
		x.read();
		x.update();
		x.delete();
	}

}
