package com.techlabs.employee.dataaccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

import com.techlabs.employee.business.Employee;

public class DiscLoader implements ILoadable {
	private int employeeID=0;
	private int employeeName=1;
	private int designation=2;
	private int managerID=3;
	private int dateOfJoining=4;
	private int salary=5;
	private int commision=6;
	private int dept_no=7;
	
	String file = "C:\\Users\\SANJAY\\Desktop\\datafile.txt";
	BufferedReader br = null;
	String st = "";
	String delimeter = ",";
	Set<Employee> employees = new HashSet<Employee>();

	@Override
	public Set<Employee> readData() {
		try {
			br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				st = st.replaceAll("\\s+", "").replaceAll("'", "");
				String[] values = st.split(delimeter);
				Employee e = new Employee(Integer.parseInt(values[employeeID]), values[employeeName]
						, values[designation], values[managerID], values[dateOfJoining],
						Integer.parseInt(values[salary]), values[commision],
						Integer.parseInt(values[dept_no]));
				employees.add(e);
				st = br.readLine();
			}
		} catch (Exception e) {
		}
		return employees;
	}
}
