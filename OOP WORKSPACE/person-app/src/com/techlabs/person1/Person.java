package com.techlabs.person1;

public class Person {
	final String name;
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
		this(name,age,gender,50,50);

	}

	public void doWorkout() {
		this.weight = weight - (2 / weight * 100);

	}

	public void eat() {
		this.weight = weight + (5 / weight * 100);
		this.height = height + (1 / weight * 100);
	}

	public float calculateBMI() {
		float bmi = (weight * 703) / (height * height);
		return bmi;
	}

	public String BMIcategory() {
		if (this.calculateBMI() < 18.5f)
			return ("underweight");
		if (this.calculateBMI() < 24.9f && this.calculateBMI() > 18.5f)
			return ("Normal weight");
		if (this.calculateBMI() > 25f && this.calculateBMI() < 29.9)
			return ("Overweight");
		if (this.calculateBMI() > 30)
			return ("obese");
		return "Normal";
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
