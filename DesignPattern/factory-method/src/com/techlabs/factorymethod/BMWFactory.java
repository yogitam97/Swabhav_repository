package com.techlabs.factorymethod;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BMWFactory implements IAutoFactory{
	private final Properties configProp = new Properties();
	private static BMWFactory bmwfactory;
	private BMWFactory() throws IOException {
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("factory.properties");
		configProp.load(in);
	}
	
	public static BMWFactory getInstance() throws IOException {
		if(bmwfactory==null)
			return new BMWFactory();
		return bmwfactory;
	}
	
	@Override
	public IAutomobile make() {
		return new BMW();
	}

}
