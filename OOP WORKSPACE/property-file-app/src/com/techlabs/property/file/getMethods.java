package com.techlabs.property.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class getMethods {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		File f=new File("E:\\Swabhav_repository\\OOP WORKSPACE\\property-file-app\\class.properties.txt");
		FileInputStream fr=new FileInputStream(f);
		
		p.load(fr);
		String cls=p.getProperty("class");
		Class c=cls.getClass();
		Method[] methods=c.getMethods();
		for(Method method:methods)
			System.out.println(method);
		
	}

}
