package com.techlabs.vehicle.test;
import com.techlabs.vehicle.*;
public class TestVehicle {

	public static void main(String[] args) {
		IMoveable vehicle[]=new IMoveable[3];
		vehicle[0]=new Truck();
		vehicle[1]=new Car();
		vehicle[2]=new Bike();
		startRace(vehicle);
			
	}
	public static void startRace(IMoveable[] vehicle) {
		System.out.println("Race started:");
		for(IMoveable i:vehicle) {
			i.move();
		}
		System.out.println("Race is ended!");
	
	}

}
