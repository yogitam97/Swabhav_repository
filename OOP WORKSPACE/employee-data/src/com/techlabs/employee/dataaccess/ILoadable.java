package com.techlabs.employee.dataaccess;

import java.util.Set;

import com.techlabs.employee.business.Employee;

public interface ILoadable {
	public Set<Employee> readData();
}
