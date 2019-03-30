package com.techlabs.employee.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlabs.employee.business.Employee;
import com.techlabs.employee.dataaccess.ILoadable;

public class EmployeeService {

	private Set<Employee> employee;

	public EmployeeService(ILoadable il) {
		employee=il.readData();
	}

	public Employee maxSalariedEmployee() {
		int max = 0;
		Employee emp = null;
		for (Employee e : employee) {
			if (e.getSalary() > max) {
				max = e.getSalary();
				emp = e;
			}
		}
		return emp;
	}

	public Map<String, Integer> getDesignationWiseCount() {
		HashMap<String, Integer> map = new HashMap();
		for (Employee e : employee) {
			if (map.containsKey(e.getDesignation())) {
				map.put(e.getDesignation(), map.get(e.getDesignation()) + 1);
			} else {
				map.put(e.getDesignation(), 1);
			}
		}
		return map;
	}

	public Map<Integer, Integer> getDepartmentWiseCount() {
		HashMap<Integer, Integer> map = new HashMap();
		for (Employee e : employee) {
			if (map.containsKey(e.getDept_no())) {
				map.put(e.getDept_no(), map.get(e.getDept_no()) + 1);
			} else {
				map.put(e.getDept_no(), 1);
			}
		}
		return map;
	}

}
