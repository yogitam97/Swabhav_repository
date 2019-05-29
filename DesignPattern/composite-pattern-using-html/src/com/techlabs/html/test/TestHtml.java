package com.techlabs.html.test;

import com.techlabs.html.Control;
import com.techlabs.html.ControlGroup;

public class TestHtml {

	public static void main(String[] args) {
		ControlGroup root=new ControlGroup("h1");
		Control control=new Control("p","text","paragraph");
		Control control2=new Control("input","text","fname");
		Control control3=new Control("input","text","lname");
		
		root.addChild(control);
		root.addChild(control2);
		root.addChild(control3);
		System.out.println(root.buildHtml());
	}

}
