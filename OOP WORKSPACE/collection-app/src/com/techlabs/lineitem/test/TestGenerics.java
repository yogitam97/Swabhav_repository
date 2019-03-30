package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestGenerics {

	public static void main(String[] args) {
		ArrayList<LineItem> cart=new ArrayList<LineItem>();
		cart.add(new LineItem(101,"Book",2,500));
		cart.add(new LineItem(102,"pen",1,500));
		cart.add(new LineItem(103,"notebook",3,50));
		
		//cart.add("shekhar");
		for(LineItem element:cart) {
			System.out.println(element.calculateTotal());
		}
	}

}
