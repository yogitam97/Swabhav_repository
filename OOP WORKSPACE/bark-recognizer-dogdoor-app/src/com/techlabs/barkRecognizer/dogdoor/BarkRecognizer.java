package com.techlabs.barkRecognizer.dogdoor;

import java.util.Iterator;
import java.util.List;

import com.techlabs.barkRecognizer.bark.Bark;
import com.techlabs.dogdoor.dogDoor;

public class BarkRecognizer {
	private dogDoor door;
	
	public BarkRecognizer(dogDoor door) {
		this.door=door;
	}
	public void recognize(Bark bark) {
		System.out.println("BarkRecognizer heard a "+bark.getSound()+" ");
		List allowedBarks = door.getAllowedBarks();
		for (Iterator i = allowedBarks.iterator(); i.hasNext(); )
		{     
			Bark allowedBark = (Bark)i.next();      
			if (allowedBark.equals(bark)) {        
				door.openDoor();        
				return;      
				}    
		}    
		System.out.println("This dog is not allowed.");  
		}
	}


