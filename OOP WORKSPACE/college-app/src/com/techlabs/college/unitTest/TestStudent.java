package com.techlabs.college.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.college.Branch;
import com.techlabs.college.Student;

public class TestStudent {
	@Test
	public void checkStudentIsGettingAddedOrNot() {
		Student student=new Student(107,"Ghatkopar","06/09/1996",Branch.COMPUTER);
		int actualId=student.getId();
		int expectedId=107;
		
		assertEquals(actualId,expectedId);
	}
}
