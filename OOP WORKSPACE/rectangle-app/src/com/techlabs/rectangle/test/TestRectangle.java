package com.techlabs.rectangle.test;

import com.techlabs.rectangle.*;

public class TestRectangle {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(100,20);
		
		Rectangle r2 = new Rectangle(50,70);
	
		printDetails(r1);
		printDetails(r2);


		Rectangle r3 = r1;
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());
		//r3.setHeight(2);
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());
		//r3=null;
		//System.out.println(r3.getHeight());
		printDetails(r3);
		//printDetails(new Rectangle());
		//System.out.println(new Rectangle().calulateArea());

	}

	public static void printDetails(Rectangle r) {
		System.out.println("width is:" + r.getWidth() + 
				" height is:" + r.getHeight() + " Area is:" + r.calulateArea());
	}

}