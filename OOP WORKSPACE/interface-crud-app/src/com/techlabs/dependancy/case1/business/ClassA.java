package com.techlabs.dependancy.case1.business;

import com.techlabs.dependancy.case1.dataaccess.ClassB;

public class ClassA {

		ClassB b=new ClassB();
		public ClassA(ClassB b) {
			this.b=b;
		}
		public void bar() {
			System.out.println("Inside bar");
			b.foo();
		}

}
