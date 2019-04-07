package com.techlabs.lsp.solution.test;

import com.techlabs.lsp.solution.Rectangle;
import com.techlabs.lsp.solution.Square;

public class TestRectangle {

	public static void main(String[] args) {
		Square r=new Square(100);
		System.out.println(r.calculateArea());
		shouldNotChangeHeightIfWidthISModified(new Rectangle(100,10));
		//shouldNotChangeHeightIfWidthISModified(new Square(100));
	}
	private static void shouldNotChangeHeightIfWidthISModified(Rectangle r) {
		int before=r.getHeight();
		r.setWidth(150);
		int after=r.getHeight();
		System.out.println(before==after);
	}
}
