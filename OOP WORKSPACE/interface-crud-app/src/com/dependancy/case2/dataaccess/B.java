package com.dependancy.case2.dataaccess;

import com.dependancy.case2.core.*;

public class B implements IFooable {

	@Override
	public void foo() {
		System.out.println("Foo called..");
	}

}
