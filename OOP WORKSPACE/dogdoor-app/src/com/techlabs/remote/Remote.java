package com.techlabs.remote;

import com.techlabs.dogdoor.*;

public class Remote {
	private dogDoor door;

	public Remote(dogDoor door) {
		this.door = door;
	}

	public void pressButton() {
		System.out.println("Pressing the remote control button...");
		if (door.isOpen()) {
			door.closeDoor();
		} else {
			door.openDoor();
		}
	}

}
