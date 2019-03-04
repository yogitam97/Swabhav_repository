package com.techlabs.guitar;

import com.techlabs.guitar.inventory.Builder;
import com.techlabs.guitar.inventory.Type;
import com.techlabs.guitar.inventory.Wood;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Wood backWood, topWood;
	private Type type;
	private int numStrings;

	public GuitarSpec(Builder builder,String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model=model;
		this.type = type;
		this.numStrings=numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public boolean matches(GuitarSpec otherSpec) {
		if ((builder != otherSpec.builder))
			return false;
		if ((model != null) && (!model.equals(""))
				&& (!model.equals(otherSpec.getModel())))
			return false;
		if ((type != otherSpec.type))
			return false;
		if ((backWood != otherSpec.backWood))
			return false;
		if ((topWood != otherSpec.topWood))
			return false;
		return true;
	}

	public Builder getBuilder() {
		return builder;
	}

	public Type getType() {
		return type;
	}
	public String getModel() {
		return model;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
	public int getNumStrings() {
		return numStrings;
	}
}
