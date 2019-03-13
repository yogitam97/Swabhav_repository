package com.techlabs.college;

import java.util.LinkedList;
import java.util.List;

public class College {
	private static String collegeName="Vidyalankar Institute of Technology";
	private List students;
	private List professors;
	private static int noOfCount=0;
	public College() {
		students=new LinkedList();
		professors=new LinkedList();
	}
	
	public void addStudents(Student student) {
		students.add(student);
		noOfCount++;
	}
	public void addProf(Professor prof) {
		professors.add(prof);
	}
	public List getStudents() {
		return students;
	}
	public List getProfessors() {
		return professors;
	}
	public String getCollgeName() {
		return collegeName;
	}
	public static int getNoOfCount() {
		return noOfCount;
	}
	

}
