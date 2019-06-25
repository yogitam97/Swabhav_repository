package com.techlabs.organization.presentation;

import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import com.techlabs.organization.business.Employee;
import com.techlabs.organization.business.EmployeeDTO;
import com.techlabs.organization.business.EmployeeService;
import com.techlabs.organization.dataaccess.DiskLoader;
import com.techlabs.organization.service.HierarchyBuilder;

public class TestEmployee {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		HierarchyBuilder hb=new HierarchyBuilder(new DiskLoader());
		hb.buildHierarchy();
		hb.generateXML();
		System.out.println(hb.returnHierarchy());

	}

}
