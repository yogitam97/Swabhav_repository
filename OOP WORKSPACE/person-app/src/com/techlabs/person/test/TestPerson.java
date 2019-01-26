package com.techlabs.person.test;

import com.techlabs.person1.Person;
import com.techlabs.person1.GenderType;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("yogita", 21, GenderType.FEMALE, 50.0f, 140.0f);
		Person p2 = new Person("Shekhar", GenderType.MALE, 20);

		printDetails(p1);
		printDetails(p2);
		p1.doWorkout();
		printDetails(p1);

	}

	public static void printDetails(Person p) {
		System.out.println("name:" + p.getName() + " age:" + p.getAge() + " gender is:" + p.getGender() + " weight:"
				+ p.getWeight() + " height:" + p.getHeight());
	}

}
