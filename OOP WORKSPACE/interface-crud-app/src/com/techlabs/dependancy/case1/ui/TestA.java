package com.techlabs.dependancy.case1.ui;

import com.techlabs.dependancy.case1.business.ClassA;
import com.techlabs.dependancy.case1.dataaccess.ClassB;

public class TestA {

	public static void main(String[] args) {
		ClassA a=new ClassA(new ClassB());
		a.bar();
	}

}
