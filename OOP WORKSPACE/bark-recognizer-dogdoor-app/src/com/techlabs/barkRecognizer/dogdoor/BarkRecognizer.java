package com.techlabs.barkRecognizer.dogdoor;

import com.techlabs.dogdoor.dogDoor;

public class BarkRecognizer {
	private dogDoor door;
	
	public BarkRecognizer(dogDoor door) {
		this.door=door;
	}
	public void recognize(String bark) {
		System.out.println("BarkRecognizer heard a "+bark+" ");
		door.openDoor();
	}

}
