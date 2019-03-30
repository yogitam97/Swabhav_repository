package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestLineItem {

	public static void main(String[] args) {
		ArrayList cart=new ArrayList();
		cart.add(new LineItem(101,"Book",2,500));
		cart.add(new LineItem(102,"pen",1,500));
		cart.add(new LineItem(103,"notebook",3,50));
		
		cart.add("shekhar");
		for(Object element:cart) {
			LineItem item=(LineItem)element;
			System.out.println(item.calculateTotal());
		}
	}

}
