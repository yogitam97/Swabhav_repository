package com.techlabs.circle;

public class Circle {
	private float radius;
	private final static float PI = 3.14f;
	private ColorOptions bgcolor;

	public float calculateArea() {
		float area = PI * radius * radius;
		return area;
	}

	public void setRadius(float radius) {
		this.radius = correctRadius(radius);
	}

	public float getRadius() {
		return radius;
	}

	public void setbgcolor(ColorOptions bgcolor) {
		this.bgcolor = bgcolor;
	}

	public ColorOptions getbgcolor() {
		return bgcolor;
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
