package com.techlabs.dependancy.case1.ui;

import com.dependancy.case2.business.A;

import com.dependancy.case2.dataaccess.B;

public class TestUI {

	public static void main(String[] args) {
		A a = new A(new B());
		a.bar();
	}

}
