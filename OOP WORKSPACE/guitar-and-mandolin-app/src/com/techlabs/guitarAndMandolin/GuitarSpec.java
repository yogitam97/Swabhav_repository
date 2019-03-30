package com.techlabs.guitarAndMandolin;

import com.techlabs.instrument.InstrumentSpec;
import com.techlabs.inventory.Builder;
import com.techlabs.inventory.Type;
import com.techlabs.inventory.Wood;

public class GuitarSpec extends InstrumentSpec {

	private int numStrings;

	public GuitarSpec(Builder builder, String model, int numStrings, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;

	}

	// Override the superclass matches()
	public boolean matches(InstrumentSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof GuitarSpec))
			return false;
		GuitarSpec spec = (GuitarSpec) otherSpec;
		if (numStrings != spec.numStrings)
			return false;
		return true;
	}

	public int getNumStrings() {
		return numStrings;
	}
}
