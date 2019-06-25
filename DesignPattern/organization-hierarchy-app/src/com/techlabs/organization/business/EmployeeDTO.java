package com.techlabs.organization.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlabs.organization.dataaccess.ILoader;

public class EmployeeDTO {
	Employee CEO;
	private Set<Employee> employees;
	private List<Employee> emps;
	private List<Employee> reportees=new ArrayList<Employee>();
	private Map<Integer,List<Employee>> emp;
	
	
	public EmployeeDTO(ILoader il) {
		emp=new HashMap<Integer,List<Employee>>();
		employees=il.readData();
		emps=new ArrayList<Employee>();
		//reportees=(List<Employee>) il.readData();
	}
	
	public void addToMap() {
	for(Employee e:employees) {
		emps.add(e);
	}
//		for(Employee e:employees) {
//			emp.put(e.getEmployeeID(), reportees);
//		}
		for(int i=0;i<emps.size();i++) {
			for(int j=0;j<emps.size();j++) {
				if(emps.get(j).getManagerID().toString().equalsIgnoreCase("Null")) {
					//CEO=emps.get(i);
					continue;
				}
				if(emps.get(i).getEmployeeID()==Integer.parseInt(emps.get(j).getManagerID())) {
					reportees.add(emps.get(j));
				}
			}
		
		for(Employee e:reportees) {
			System.out.print(e.getEmployeeID()+" "+e.getEmployeeName()+" "+e.getManagerID()+" ");
			emp.put(e.getEmployeeID(), reportees);
		}
		System.out.println(" ");
		reportees.clear();
		}
		}
	
		public void display() {
			for(Map.Entry m:emp.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());	
				}
		
		
	}
}
