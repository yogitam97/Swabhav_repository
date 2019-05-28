package com.techlabs.factorymethod;

public class TeslaFactory implements IAutoFactory {
	private static TeslaFactory teslafactory;

	private TeslaFactory() {

	}

	public static TeslaFactory getInstance() {
		if (teslafactory == null)
			return new TeslaFactory();
		return teslafactory;
	}

	@Override
	public IAutomobile make() {
		return new Tesla();

	}

}
