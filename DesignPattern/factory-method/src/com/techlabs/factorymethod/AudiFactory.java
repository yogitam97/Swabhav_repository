package com.techlabs.factorymethod;

public class AudiFactory implements IAutoFactory {
	private static AudiFactory audifactory;

	private AudiFactory() {

	}

	public static AudiFactory getInstance() {
		if (audifactory == null)
			return new AudiFactory();
		return audifactory;
	}

	@Override
	public IAutomobile make() {
		return new Audi();

	}

}
