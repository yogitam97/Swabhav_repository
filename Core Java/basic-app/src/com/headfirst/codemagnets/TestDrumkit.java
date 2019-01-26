package com.headfirst.codemagnets;


class Drumkit {
	boolean topHat = true;
	boolean snare = true;

	void playsnare() {
		System.out.println("bang bang ba-bang");
	}

	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}


public class TestDrumkit {

	public static void main(String[] args) {
		Drumkit d=new Drumkit();
		d.playsnare();
		d.snare=false;
		d.playTopHat();
		if(d.snare==true)
		{
			d.playsnare();
		}
		

	}

}