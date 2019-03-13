package com.techlabs.college.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.college.Branch;
import com.techlabs.college.Professor;

public class TestProfessor {
	@Test
	public void checkStudentIsGettingAddedOrNot() {
		Professor professor = new Professor(101, "Andheri", "15/08/1980", 50000);
		int actualId=professor.getId();
		int expectedId=101;
		
		assertEquals(actualId,expectedId);
	}
}
