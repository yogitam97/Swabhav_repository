package com.techlabs.remote;

import java.util.Timer;
import java.util.TimerTask;
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
			final Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				public void run() {
					door.closeDoor();
					timer.cancel();
				}
			}, 5000);
		}
	}

}
