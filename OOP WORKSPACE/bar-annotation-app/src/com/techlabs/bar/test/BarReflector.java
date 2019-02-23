package com.techlabs.bar.test;

import java.lang.reflect.Method;

import com.techlabs.bar.ProUnitTest;

public class BarReflector {

	public static void main(String[] args) throws IllegalAccessExeption
	,IllegalArgumentException{
		int count=0,fcount=0;
		Class cls=Bar.class;
		Method[] m=cls.getMethods();
		for(Method method:m)
			if(method.isAnnotationPresent(ProUnitTest.class))
				boolean result=(boolean)method.invoke(cls.newInstance());
				checkIfPassed(result);
				checkIfFailed(result);
	}

	public static void checkIfPassed(boolean result) {
		if (result == true)
			count++;
	}

	public static void checkIfFailed(boolean result) {
		if (result == false)
			fcount++;
	}
}
