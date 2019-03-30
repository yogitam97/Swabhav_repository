package com.techlabs.lineitem.map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

import com.techlabs.lineitem.LineItem;

public class TestTreemap {

	public static void main(String[] args) {
		TreeMap<LineItem,LineItem> treemap=new TreeMap();
		LineItem cart1=new LineItem(101,"Book",2,500);
		LineItem cart2=new LineItem(102,"pen",1,500);
		LineItem cart3=new LineItem(103,"notebook",3,50);
		treemap.put(cart1, cart1);
		treemap.put(cart2, cart2);
		treemap.put(cart3, cart3);
		System.out.println(treemap.size());
		
		for(LineItem item:treemap.values())
			System.out.println(item.getId()+" "+item.getName()+" "+item.getQuantity()
			+" "+item.getCost());

	}

}
