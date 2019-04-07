package com.techlabs.lsp.violation.test;

import com.techlabs.lsp.violation.Rectangle;
import com.techlabs.lsp.violation.Square;

public class TestRectangle {
public static void main(String[] args) {
	shouldNotChangeHeightIfWidthISModified(new Rectangle(100,10));
	shouldNotChangeHeightIfWidthISModified(new Square(100,100));
}
private static void shouldNotChangeHeightIfWidthISModified(Rectangle r) {
	int before=r.getHeight();
	r.setWidth(150);
	int after=r.getHeight();
	System.out.println(before==after);
}
}

