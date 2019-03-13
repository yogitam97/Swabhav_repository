package com.techlabs.college.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.college.*;

public class TestCollege {

	public static void main(String[] args) {
		College college = new College();
		Professor professor = new Professor(101, "Andheri", "15/08/1980", 50000);
		Student student = new Student(102, "Dombivali", "21/09/1995", Branch.COMPUTER);
		Student student2 = new Student(103, "Ghansoli", "14/08/1995", Branch.COMPUTER);
		Student student3 = new Student(104, "Parel", "24/06/1995", Branch.COMPUTER);
		college.addStudents(student);
		college.addStudents(student2);
		college.addStudents(student3);
		college.addProf(professor);
		printDetails(college);
	}
  

		public static void printDetails(College college) {
			List listOfStudents = college.getStudents();
			List listOfProf=college.getProfessors();
			for(Iterator i=listOfStudents.iterator();i.hasNext();) {
				Student st=(Student)i.next();
				System.out.println("college:"+college.getCollgeName()+
						"\nId:"+st.getId()+"\nAddress:"+st.getAddress()+"\nDob:"+st.getDob()+
						"\nBranch:"+st.getBranch());
			}
			for(Iterator i=listOfProf.iterator();i.hasNext();) {
				Professor prof=(Professor)i.next();
				System.out.println("Id:"+prof.getId()+"\nAddress:"+prof.getAddress()+
		    			"\nDob:"+prof.getDob()+"\nsalary:"+prof.getSalary());
			
			}
			System.out.println("No of students:"+college.getNoOfCount());
		

	}

}
