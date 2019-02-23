package com.techlabs.annotation.test;

import com.techlabs.annotation.RequireModification;
import com.techlabs.annotation.test.*;
import java.lang.annotation.*;
import java.lang.reflect.Method;

public class FooReflector {
	public static void main(String[] args) {
	int count=0;
	Class cls = Foo.class;
	Method[] methods=cls.getMethods();
	for(Method method:methods) {
		if(method.isAnnotationPresent(RequireModification.class))
			count++;
	}
	System.out.println("found "+count+" methods with annotations");
	}
}
