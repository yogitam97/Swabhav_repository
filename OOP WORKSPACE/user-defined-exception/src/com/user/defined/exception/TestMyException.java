package com.user.defined.exception;

import com.techlabs.exception.*;

public class TestMyException {

	public static void main(String[] args) {
		int a = 100;
		if(a<500)
			throw new MyException("Number is less than 500");
		
	}

}
