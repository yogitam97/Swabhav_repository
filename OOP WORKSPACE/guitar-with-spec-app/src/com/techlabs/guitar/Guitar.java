package com.techlabs.guitar;

import com.techlabs.guitar.inventory.Builder;
import com.techlabs.guitar.inventory.Type;
import com.techlabs.guitar.inventory.Wood;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber, double price,Builder builder,String model, Type type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec=new GuitarSpec(builder, model, type, backWood, topWood);

	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public double getPrice() {
		return price;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}
