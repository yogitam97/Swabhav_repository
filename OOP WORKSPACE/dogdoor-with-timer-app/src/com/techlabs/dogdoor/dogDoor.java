package com.techlabs.dogdoor;

public class dogDoor {
	private boolean open;
	
	public dogDoor() {
		this.open=false;
	}
	
	public void openDoor() {
		System.out.println("The dog door opens");
		this.open=true;
	}
	
	public void closeDoor() {
		System.out.println("The dog door closes");
		this.open=false;
	}
	
	public boolean isOpen() {
		return open;
	}
}
