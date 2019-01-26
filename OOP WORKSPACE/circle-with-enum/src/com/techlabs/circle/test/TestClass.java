package com.techlabs.circle.test;

import com.techlabs.circle.*;

public class TestClass {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(0.4f);
		c.setbgcolor(ColorOptions.RED);
		float area = c.calculateArea();
		System.out.println("The radius is:" + c.getRadius() + 
				" Color is:" + c.getbgcolor() + " Area is:" + area);
	}

}
