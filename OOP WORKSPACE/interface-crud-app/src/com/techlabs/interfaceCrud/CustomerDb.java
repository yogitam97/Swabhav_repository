package com.techlabs.interfaceCrud;

public class CustomerDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Adding to CustomerDB");
	}

	@Override
	public void read() {
		System.out.println("Reading to CustomerDB");
	}

	@Override
	public void update() {
		System.out.println("Updating to CustomerDB");
	}

	@Override
	public void delete() {
		System.out.println("Deleting to CustomerDB");
	}

}
