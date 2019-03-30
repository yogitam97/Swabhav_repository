package com.techlabs.employee.test;

import java.io.IOException;
import java.util.Set;

import com.techlabs.employee.business.*;
import com.techlabs.employee.dataaccess.DiscLoader;
import com.techlabs.employee.dataaccess.ILoadable;
import com.techlabs.employee.dataaccess.WebLoader;
import com.techlabs.employee.service.EmployeeService;

public class TestEmployee {

	public static void main(String[] args) throws IOException {
		
		EmployeeService emp = new EmployeeService(new DiscLoader());
		System.out.println(emp.getDesignationWiseCount());
		System.out.println(emp.getDepartmentWiseCount());
		System.out.println("Employee with max salary: \n"+emp.maxSalariedEmployee());
	}


}
