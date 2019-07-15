package com.techlabs.candidate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private float cgpa;
	
	public Candidate() {
		System.out.println("candidate");
	}
	public Candidate( String name, float cgpa) {
		this.name = name;
		this.cgpa = cgpa;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getCgpa() {
		return cgpa;
	}
}
