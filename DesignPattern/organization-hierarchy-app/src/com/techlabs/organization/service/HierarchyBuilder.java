package com.techlabs.organization.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.techlabs.organization.business.Employee;
import com.techlabs.organization.dataaccess.DiskLoader;
import com.techlabs.organization.dataaccess.ILoader;

public class HierarchyBuilder {
	Employee emp = new Employee();
	ILoader il;
	DiskLoader dloader;
	private Set<Employee> employee;
	private List<Employee> employees;
	private List<Employee> employees2;
	private List<Employee> level;
	private List<Employee> level2;
	private List<Employee> level3;

	private String str;
	

	public HierarchyBuilder(ILoader il) {
		employee = il.readData();
		dloader = (DiskLoader) il;
		employees = new ArrayList<Employee>();
		employees2 = new ArrayList<Employee>();
		level = dloader.getLevel1();
		level2 = dloader.getLevel2();
		level3 = dloader.getLevel3();
	}

	public void generateXML() throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.newDocument();

		// root element
		Element rootElement = doc.createElement("Employees");
		doc.appendChild(rootElement);

		Element CEO = doc.createElement("CEO");

		Element employeeName = doc.createElement("name");
		employeeName.setTextContent("KING");

		 CEO.appendChild(employeeName);
		rootElement.appendChild(CEO);

		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("employee-hierarchy.xml"));
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		// Beautify the format of the resulted XML
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
		transformer.transform(source, result);
		
		for(int i=0;i<level.size();i++) {
			
		}
	}

	public void buildHierarchy() {
		str = str + "KING\n";
		int index = 0;
		for (int counter = 0; counter < level.size(); counter++) {
			if (level.get(counter) != null) {
				str = str + "     ->" + level.get(counter).getEmployeeName() + "\n";
				for (int counter1 = index; counter1 < level2.size(); counter1++) {
					if (level2.get(counter1) == null) {
						index++;
						break;

					}
					str = str + "            " + level2.get(counter1).getEmployeeName();
					str = str + "\n";
					index++;
					for (int counter2 = 0; counter2 < level3.size(); counter2++) {
						if (level3.get(counter2) == null)
							continue;
						if (level2.get(counter1).getEmployeeID() == Integer
								.parseInt(level3.get(counter2).getManagerID())) {
							str = str + "                        ->" + level3.get(counter2).getEmployeeName() + "\n";
						}
					}
				}
			}
		}

	}

	public String returnHierarchy() {
		return str;

	}
}
