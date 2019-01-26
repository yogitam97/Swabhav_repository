package com.techlabs.circle.test;
import com.techlabs.circle.*;

public class TestCircle {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(0.5f);
		c.setbgcolor("Black");
		float area=c.calculateArea();
		System.out.println("The radius is:"+c.getRadius()+" Color is:"+c.getbgcolor()+" area is:"+area);
		
	}

}
