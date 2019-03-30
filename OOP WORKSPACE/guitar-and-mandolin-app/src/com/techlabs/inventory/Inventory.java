package com.techlabs.inventory;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;

import com.techlabs.guitarAndMandolin.Guitar;
import com.techlabs.guitarAndMandolin.GuitarSpec;
import com.techlabs.guitarAndMandolin.*;
import com.techlabs.instrument.*;

public class Inventory {  
	private List inventory;  
	public Inventory() {    
		inventory = new LinkedList();  
		} 
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = new Instrument(serialNumber, price,spec);     
		inventory.add(instrument);  
		}  
	public Instrument get(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext(); ) {
			Instrument instrument = (Instrument)i.next();      
			if (instrument.getSerialNumber().equals(serialNumber)) {       
				return instrument;      
				}  
			}
		return null;  
		}
	public List search(InstrumentSpec searchSpec) {
		List matchingInstruments = new LinkedList();    
		for (Iterator i = inventory.iterator(); i.hasNext(); ) {    
			Instrument instrument = (Instrument)i.next();      
			if (instrument.getSpec().matches(searchSpec))       
				matchingInstruments.add(instrument);   
			}   
		return matchingInstruments;  
		}
	} 
