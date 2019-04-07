package com.techlabs.lsp.solution;

public class Square implements IShape{
	private int side;
	public Square(int side) {
		this.side=side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	@Override
	public int calculateArea() {
		return side*side;
	}
}
