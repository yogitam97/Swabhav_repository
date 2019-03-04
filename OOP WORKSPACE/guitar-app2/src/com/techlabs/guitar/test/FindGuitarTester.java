package com.techlabs.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.inventory.*;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory=new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes=new Guitar("",0,Builder.FENDER,"Stratocaster",
				Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		List matchingGuitars=inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like this guitars: ");
			for(Iterator i=matchingGuitars.iterator();i.hasNext();) {
				Guitar guitar=(Guitar)i.next();
				
				System.out.println("We have: "+guitar.getBuilder()+" "+guitar.getModel()+" "
				+guitar.getType()+" "+guitar.getBackWood()+" back and sides "+guitar.getTopWood()+" "+
				"top. \nYou can have it for only $"+guitar.getPrice()+"!\n---------");
			}}
		else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
		
	}
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693",1499.95, Builder.FENDER, "Stratocaster",
				Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocaster",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		
	}

}
