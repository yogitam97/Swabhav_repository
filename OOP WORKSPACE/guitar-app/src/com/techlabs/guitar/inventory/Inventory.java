package com.techlabs.guitar.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.guitar.Guitar;

public class Inventory {
	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, 
			String model, Type type, Wood backWood,Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, 
		type, backWood, topWood);
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

	public List search(Guitar searchGuitar) {
		List matchingGuitars=new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			Builder builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
				continue;
			String model = searchGuitar.getModel().toLowerCase();
			if ((model != null) && (!model.equals(""))
					&& (!model.equals(guitar.getModel().toLowerCase())))
				continue;
			Type type = searchGuitar.getType();
			if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType())))
				continue;
			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
				continue;
			Wood topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))
				continue;
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;

	}

}
