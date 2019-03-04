package com.techlabs.guitar.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;

public class Inventory {
	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, 
			String model, Type type, Wood backWood,Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price,builder,model,type,backWood,topWood);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber))
				;
			return guitar;
		}
		return null;
	}

	public List search(GuitarSpec searchSpec) {
		List matchingGuitars=new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if(guitar.getSpec().matches(searchSpec)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;

	}

}
