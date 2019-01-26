package com.techlabs.person1;

public class Person {
	private String name;
	private GenderType gender;
	private int age;
	private float weight;
	private float height;

	
	public Person(String name, int age, GenderType gender, float weight, float height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;

	}

	public Person(String name, GenderType gender, int age) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = 50;
		this.height = 50;

	}

	public void doWorkout() {
		this.weight = weight - (2 / weight * 100);

	}

	public void eat() {
		this.weight = weight + (5 / weight * 100);
		this.height = height + (1 / weight * 100);
	}

	public String getName() {
		return name;
	}

	public GenderType getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
	}
}
