package com.techlabs.dogdoor;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.techlabs.barkRecognizer.bark.Bark;

public class dogDoor {
	private boolean open;
	private List allowedBarks = new LinkedList();

	public dogDoor() {
		this.open = false;
	}

	public void openDoor() {
		System.out.println("The dog door opens");
		this.open = true;
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
		this.open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public void addAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}

	public void setAllowedBarks(List allowedBarks) {
		this.allowedBarks = allowedBarks;
	}

	public List getAllowedBarks() {
		return allowedBarks;
	}

}
