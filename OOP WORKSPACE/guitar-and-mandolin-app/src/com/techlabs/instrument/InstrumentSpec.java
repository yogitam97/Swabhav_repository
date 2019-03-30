package com.techlabs.instrument;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.techlabs.inventory.Builder;
import com.techlabs.inventory.Type;
import com.techlabs.inventory.Wood;

public class InstrumentSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood,topWood;
	private Map properties;

	public InstrumentSpec(Map properties) {
		if (properties == null) {
			this.properties = new HashMap();
		} else {
			this.properties = new HashMap(properties);
		}
	}
	public InstrumentSpec(Builder builder,String model,Type type,Wood backWood,Wood topWood) {
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.backWood=backWood;
		this.topWood=topWood;
	}

	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}

	public Map getProperties() {
		return properties;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext();) {
			String propertyName = (String) i.next();
			if (!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
				return false;
			}
		}
		return true;
	}
	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

}