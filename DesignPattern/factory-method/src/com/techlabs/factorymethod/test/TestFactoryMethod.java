package com.techlabs.factorymethod.test;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factorymethod.AudiFactory;
import com.techlabs.factorymethod.BMWFactory;
import com.techlabs.factorymethod.IAutoFactory;
import com.techlabs.factorymethod.IAutomobile;
import com.techlabs.factorymethod.TeslaFactory;

public class TestFactoryMethod {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		FileReader reader=new FileReader("factory.properties");
		Properties p=new Properties();  
		p.load(reader);
		String cls=p.getProperty("concreteFactory");
		Class cls2=Class.forName(cls);
		Method m=cls2.getDeclaredMethod("getInstance");
		IAutoFactory factory=(IAutoFactory) m.invoke(null,null);
		IAutomobile auto=factory.make();
		
		auto.start();
		auto.stop();
		
		
	}
	

}
