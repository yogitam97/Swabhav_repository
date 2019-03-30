package com.techlabs.lineitem.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

import com.techlabs.lineitem.LineItem;

public class TestLinkedHashmap {

	public static void main(String[] args) {
		LinkedHashMap<LineItem,LineItem> linkedhashmap=new LinkedHashMap();
		LineItem cart1=new LineItem(101,"Book",2,500);
		LineItem cart2=new LineItem(102,"pen",1,500);
		LineItem cart3=new LineItem(103,"notebook",3,50);
		linkedhashmap.put(cart1, cart1);
		linkedhashmap.put(cart2, cart2);
		linkedhashmap.put(cart3, cart3);
		System.out.println(linkedhashmap.size());
		
		for(LineItem item:linkedhashmap.values())
			System.out.println(item.getId()+" "+item.getName()+" "+item.getQuantity()
			+" "+item.getCost());

	}

}
