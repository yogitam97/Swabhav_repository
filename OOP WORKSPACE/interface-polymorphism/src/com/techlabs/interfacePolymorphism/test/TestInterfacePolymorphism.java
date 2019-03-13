package com.techlabs.interfacePolymorphism.test;
import com.techlabs.interfacePolymorphism.*;
public class TestInterfacePolymorphism {

	public static void main(String[] args) {
		Man man=new Man();
		Boy boy=new Boy();
		atTheMovie(boy);
		//atTheMovie(man);
		atTheParty(man);
		atTheParty(boy);
	}
	public static void atTheMovie(IEmotionable obj) {
		System.out.println("At the movie:");
		obj.cry();
		obj.laugh();
	}
	public static void atTheParty(IMannerable obj) {
		System.out.println("At the party:");
		obj.wish();
		obj.depart();
	}

}
