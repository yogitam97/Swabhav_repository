package com.techlabs.dogdoor.simulator;

import com.techlabs.dogdoor.dogDoor;
import com.techlabs.remote.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		dogDoor door=new dogDoor();
		Remote remote=new Remote(door);
		System.out.println("Fido bark to go outside..");
		remote.pressButton();
		System.out.println("Fido has gone outside..");
		remote.pressButton();
		System.out.println("Fido's all done..");
		remote.pressButton();
		System.out.println("Fido's back inside..");
		remote.pressButton();
	}

}
