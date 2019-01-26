package com.techlabs.circle;

public class Circle {
	private float radius;
	final static float pi = 3.14f;
	private String bgcolor;

	public float calculateArea() {
		float area = pi * radius * radius;
		return area;
	}

	public void setRadius(float radius) {
		this.radius = correctRadius(radius);
	}

	public float getRadius() {
		return radius;
	}

	public void setbgcolor(String bgcolor) {
		this.bgcolor = checkBgColor(bgcolor);
	}

	public String getbgcolor() {
		return bgcolor;
	}

	private String checkBgColor(String bgcolor) {
		if (bgcolor.equalsIgnoreCase("Blue") || bgcolor.equalsIgnoreCase("Green")
				|| bgcolor.equalsIgnoreCase("Red")) {
			return bgcolor;
		} 
			return "Blue";
	}

	public float correctRadius(float radius) {
		if (radius < 0.1) {
			radius = 0.1f;
		} else if (radius > 0.9) {
			radius = 0.9f;
		}
		return radius;
	}

}
