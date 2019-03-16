package com.techlabs.dogdoor.simulator;

import com.techlabs.barkRecognizer.dogdoor.BarkRecognizer;
import com.techlabs.dogdoor.dogDoor;
import com.techlabs.remote.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		dogDoor door = new dogDoor();
		BarkRecognizer recognizer=new BarkRecognizer(door);
		Remote remote = new Remote(door);
		System.out.println("Fido starts barking");
		recognizer.recognize("woof");
		System.out.println("Fido has gone outside...");    
		System.out.println("Fido’s all done...");    
		try {      
			Thread.currentThread().sleep(10000);    
			} catch (InterruptedException e) { }
		System.out.println("..but he is stuck outside");
		System.out.println("Fido starts barking");
		recognizer.recognize("woof");
		System.out.println("Fido's back inside..");
	}

}
