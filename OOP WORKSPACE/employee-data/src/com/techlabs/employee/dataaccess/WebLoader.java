package com.techlabs.employee.dataaccess;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import com.techlabs.employee.business.Employee;

public class WebLoader implements ILoadable {
	private int employeeID=0;
	private int employeeName=1;
	private int designation=2;
	private int managerID=3;
	private int dateOfJoining=4;
	private int salary=5;
	private int commision=6;
	private int dept_no=7;
	String line = "";
	String delimeter = ",";
	Set<Employee> employees = new HashSet<Employee>();

	@Override
	public Set<Employee> readData() {
		try {
			URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			while ((line = br.readLine()) != null) {
				line = line.replaceAll("\\s+", "").replaceAll("'", "");
				String[] values = line.split(delimeter);
				Employee e = new Employee(Integer.parseInt(values[employeeID]), values[employeeName]
						, values[designation], values[managerID], values[dateOfJoining],
						Integer.parseInt(values[salary]), values[commision],
						Integer.parseInt(values[dept_no]));
				employees.add(e);
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employees;
	}

}
