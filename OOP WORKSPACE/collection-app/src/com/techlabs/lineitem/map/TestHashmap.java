package com.techlabs.lineitem.map;
import java.util.HashMap;
import java.util.Map;

import com.techlabs.lineitem.*;
public class TestHashmap {

	public static void main(String[] args) {
		HashMap<LineItem,LineItem> hashmap=new HashMap();
		LineItem cart1=new LineItem(101,"Book",2,500);
		LineItem cart2=new LineItem(102,"pen",1,500);
		LineItem cart3=new LineItem(103,"notebook",3,50);
		hashmap.put(cart1, cart1);
		hashmap.put(cart2, cart2);
		hashmap.put(cart3, cart3);
		System.out.println(hashmap.size());
		
		for(LineItem item:hashmap.values())
			System.out.println(item.getId()+" "+item.getName()+" "+item.getQuantity()
			+" "+item.getCost());
	}

}
