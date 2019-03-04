package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;

	public int calulateArea() {

		int area = this.width * this.height;
		return area;
	}
	public Rectangle(int width,int height) {
		this.width=checkDimension(width);
		this.height=checkDimension(height);
	}

	public int getWidth() {
		return width;
	}

	
	public int getHeight() {
		return height;
	}

	private int checkDimension(int dim) {
		if (dim > 100) {
			dim = 100;
		} else if (dim < 1) {
			dim = 1;
		} else {
			return dim;
		}
		return dim;
	}
}