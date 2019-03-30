package com.techlabs.guitarAndMandolin;

import com.techlabs.instrument.Instrument;
import com.techlabs.inventory.Builder;
import com.techlabs.inventory.Type;
import com.techlabs.inventory.Wood;

public class Guitar extends Instrument {

	private GuitarSpec spec;

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		super(serialNumber, price, spec);
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}
