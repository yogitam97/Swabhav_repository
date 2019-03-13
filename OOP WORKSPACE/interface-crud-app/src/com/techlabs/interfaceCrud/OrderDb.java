package com.techlabs.interfaceCrud;

public class OrderDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Adding to OrderDB");
	}

	@Override
	public void read() {
		System.out.println("Reading to OrderDB");
	}

	@Override
	public void update() {
		System.out.println("Updating to OrderDB");
	}

	@Override
	public void delete() {
		System.out.println("Deleting to OrderDB");
	}

}
