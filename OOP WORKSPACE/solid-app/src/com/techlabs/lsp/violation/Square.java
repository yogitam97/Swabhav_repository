package com.techlabs.lsp.violation;

public class Square extends Rectangle{

	public Square(int width, int height) {
		super(width, height);
	}
	public void setWidth(int width) {
		this.width = width;
		this.height=width;
	}
	public void setHeight(int height) {
		this.height = height;
		this.width=height;
	}

}
