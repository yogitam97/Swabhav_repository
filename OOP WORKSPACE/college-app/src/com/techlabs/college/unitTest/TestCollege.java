package com.techlabs.college.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.college.Branch;
import com.techlabs.college.College;
import com.techlabs.college.Student;

public class TestCollege {
	@Test
	public void checkNoOfStudentEqaulToAddedStudents() {
		College college=new College();
		Student student = new Student(102, "Dombivali", "21/09/1995", Branch.COMPUTER);
		college.addStudents(student);
		Student student2 = new Student(103, "Ghansoli", "14/08/1995", Branch.COMPUTER);
		college.addStudents(student2);
		Student student3 = new Student(104, "Parel", "24/06/1995", Branch.COMPUTER);
		college.addStudents(student3);
		
		int actualCount=college.getNoOfCount();
		int expectedCount=3;
		
		assertEquals(actualCount,expectedCount);
	}
}
