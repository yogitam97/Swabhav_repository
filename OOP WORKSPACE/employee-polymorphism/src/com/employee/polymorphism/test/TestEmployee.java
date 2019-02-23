package com.employee.polymorphism.test;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.employee.polymorphism.*;
public class TestEmployee {

	public static void main(String[] args) {
	    Date date = new Date(); 
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		Manager m1=new Manager("abc",25000,formatter.format(date));
		Developer d1=new Developer("xyz",100,formatter.format(date));
		Analyst a1=new Analyst("ram",22000,formatter.format(date));
		printDetails(m1);
		printDetails(d1);
		printDetails(a1);
	}
	public static void printDetails(Employee e) {
		System.out.println("emp no:"+e.getempno()+
				" name:"+e.getname()+" salary:" +e.calculateTotalSalary()
				+" date of joining:"+e.getdate());
	}

}
