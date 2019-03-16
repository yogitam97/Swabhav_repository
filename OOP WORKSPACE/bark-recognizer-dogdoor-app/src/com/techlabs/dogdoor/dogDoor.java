package com.techlabs.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class dogDoor {
	private boolean open;
	
	public dogDoor() {
		this.open=false;
	}
	
	public void openDoor() {
		System.out.println("The dog door opens");
		this.open=true;
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				closeDoor();
				timer.cancel();
			}
		}, 5000);
	}
	
	public void closeDoor() {
		System.out.println("The dog door closes");
		this.open=false;
	}
	
	public boolean isOpen() {
		return open;
	}
}
