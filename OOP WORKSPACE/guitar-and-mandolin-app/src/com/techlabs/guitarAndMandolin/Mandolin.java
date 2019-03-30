package com.techlabs.guitarAndMandolin;

import com.techlabs.instrument.Instrument;
import com.techlabs.instrument.InstrumentSpec;

public class Mandolin extends Instrument{
	private MandolinSpec spec;
	
	public Mandolin(String serialNumber, double price, MandolinSpec spec) {
		super(serialNumber, price, spec);
	}

	
	
	public MandolinSpec getSpec() {
		return spec;
	}
}
