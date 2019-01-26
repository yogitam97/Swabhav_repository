package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;

	public int calulateArea() {

		int area = this.width * this.height;
		return area;
	}

	public void setWidth(int width) {
		this.width = checkDimension(width);
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = checkDimension(height);
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