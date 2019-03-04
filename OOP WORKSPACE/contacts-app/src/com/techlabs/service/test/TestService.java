package com.techlabs.service.test;

import java.io.IOException;

import com.techlabs.contact.*;
import com.techlabs.contact.service.Service;

public class TestService {

	public static void main(String[] args) throws IOException {
		Service service = new Service();
		Service s[] = new Service[3];
		service.add("9869525125", "abc@gmail.com", "abc");
		s[0]=new Service();
		s[0].add("9980778688", "xyz@gmail.com", "xyz");
		s[1]=new Service();
		s[1].add("8823393404", "foo@gmail.com", "foo");
		s[2]=new Service();
		s[2].add("7273839489", "jeh@gmail.com", "jeh");
		service.NumberOfLines();
		String str[] = service.display();
		String search=service.Search("jeh");
		System.out.println(search);
		
		

		
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
		
	}

}
