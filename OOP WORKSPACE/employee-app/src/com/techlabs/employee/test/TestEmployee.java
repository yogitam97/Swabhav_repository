package com.techlabs.employee.test;
import com.techlabs.employee.*;
public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("yogita","more");
		System.out.println(e1.getEmpno());
		Employee e2=new Employee("deepak","gupta");
		System.out.println(e2.getEmpno());
		System.out.println(e1.getEmpno());
		System.out.println(e2.getEmpno());
		System.out.println(e2.getEmpno());
		Employee e3=new Employee("Shekhar","patil");
		System.out.println(e3.getEmpno());
	}

}
