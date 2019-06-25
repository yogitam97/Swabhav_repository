package com.techlabs.organization.dataaccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.techlabs.organization.business.Employee;


public class DiskLoader implements ILoader {
	private Employee CEO;
	private int employeeID=0;
	private int employeeName=1;
	private int designation=2;
	private int managerID=3;
	private int dateOfJoining=4;
	private int salary=5;
	private int commision=6;
	private int dept_no=7;
	private int mng=1;
	private int clr=1;
	private int sales=1;
	private int ana=1;
	Employee[] manager=new Employee[10];
	Employee[] clerk=new Employee[10];
	Employee[] salesman=new Employee[10];
	Employee[] analyst=new Employee[10];
	
	List<Employee> list=new ArrayList();
	List<Employee> list2=new ArrayList();
	List<Employee> list3[]=new ArrayList[100];
	List<Employee> list4=new ArrayList();
	List<Employee> list5=new ArrayList();
	
	List<Employee> level1=new ArrayList();
	List<Employee> level2=new ArrayList();
	List<Employee> level3=new ArrayList();
	
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
				if(values[managerID].equalsIgnoreCase("Null")) {
				CEO = new Employee(Integer.parseInt(values[employeeID]), values[employeeName]
						, values[designation], values[managerID], values[dateOfJoining],
						Integer.parseInt(values[salary]), values[commision],
						Integer.parseInt(values[dept_no]));
				employees.add(CEO);
				}
				st = br.readLine();
				if(values[designation].equalsIgnoreCase("Manager")) {
					manager [mng++]=new Employee(Integer.parseInt(values[employeeID]), values[employeeName]
							, values[designation], values[managerID], values[dateOfJoining],
							Integer.parseInt(values[salary]), values[commision],
							Integer.parseInt(values[dept_no]));
					employees.add(manager[mng-1]);
				}
				if(values[designation].equalsIgnoreCase("Clerk")) {
					clerk [clr++]=new Employee(Integer.parseInt(values[employeeID]), values[employeeName]
							, values[designation], values[managerID], values[dateOfJoining],
							Integer.parseInt(values[salary]), values[commision],
							Integer.parseInt(values[dept_no]));
					employees.add(clerk[clr-1]);
				}
				if(values[designation].equalsIgnoreCase("salesman")) {
					salesman [sales++]=new Employee(Integer.parseInt(values[employeeID]), values[employeeName]
							, values[designation], values[managerID], values[dateOfJoining],
							Integer.parseInt(values[salary]), values[commision],
							Integer.parseInt(values[dept_no]));
					employees.add(salesman[sales-1]);
				}
				if(values[designation].equalsIgnoreCase("analyst")) {
					analyst [ana++]=new Employee(Integer.parseInt(values[employeeID]), values[employeeName]
							, values[designation], values[managerID], values[dateOfJoining],
							Integer.parseInt(values[salary]), values[commision],
							Integer.parseInt(values[dept_no]));
					employees.add(analyst[ana-1]);
				}
			}
		} catch (Exception e) {
		}for (int x = 0; x < list3.length; x++) {
            list3[x] = new ArrayList<>();
        }
		for(Employee emp:employees) {
			list2.add(emp);
		}
		for(Employee emp:employees) {
			if(emp.getManagerID().toString().equalsIgnoreCase("null")) {
				continue;
			}
			else if(CEO.getEmployeeID()==Integer.parseInt(emp.getManagerID())){
				emp.setLevel(1);
				list.add(emp);
			}list.add(null);
			}
		  int k=0; 
		for (int counter1 = 0; counter1 < list.size(); counter1++) { 	
			for (int counter2 = 0; counter2 < list2.size(); counter2++) { 
				if(list2.get(counter2).getManagerID().equalsIgnoreCase("null")) {
					continue;
				}
				if(list.get(counter1)==null) {
					continue;
				}
				if(list.get(counter1).getEmployeeID()==
						Integer.parseInt(list2.get(counter2).getManagerID())) {
					list2.get(counter2).setLevel(2);
					list3[k].add(list2.get(counter2));
				}
			}
			k++;
	         		

	      }   	
		

		for(int counter=0;counter<list3.length;counter++) {
			for (int counter1 = 0; counter1 < list3[counter].size(); counter1++) {
				list4.add(list3[counter].get(counter1));		
			}
			list4.add(null);
		}
		int counter4=0;
		while(counter4<list4.size()) {
			if(counter4+1<list4.size()) {
			if(list4.get(counter4)!=list4.get(counter4+1)) {
				level2.add(list4.get(counter4));
			}
			

			}
			counter4++;
		}
		for(int counter=0;counter<list4.size();counter++) {
			for (int counter1 = 0; counter1 < list2.size(); counter1++) {
				

				if(list2.get(counter1).getManagerID().equalsIgnoreCase("null")) {
					continue;
				}
				if(list4.get(counter)==null) {
					continue;
				}
				if(list4.get(counter).getEmployeeID()==
						Integer.parseInt(list2.get(counter1).getManagerID())) {
					list2.get(counter1).setLevel(3);
					list5.add(list2.get(counter1));
				}
					

			}
			list5.add(null);
		}
		counter4=0;
		while(counter4<list5.size()) {
			if(counter4+1<list5.size()) {
			if(list5.get(counter4)!=list5.get(counter4+1)) {
				level3.add(list5.get(counter4));
			}
			

			}
			counter4++;
		}
		counter4=0;
		while(counter4<list.size()) {
			if(counter4+1<list.size()) {
			if(list.get(counter4)!=list.get(counter4+1)) {
				level1.add(list.get(counter4));
			}
			

			}
			counter4++;
		}
	
		return employees;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(int employeeName) {
		this.employeeName = employeeName;
	}

	public int getDesignation() {
		return designation;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public Employee[] getClerk() {
		return clerk;
	}

	public void setClerk(Employee[] clerk) {
		this.clerk = clerk;
	}

	public List<Employee> getList5() {
		return list5;
	}

	public void setList5(List<Employee> list5) {
		this.list5 = list5;
	}

	public Employee[] getMng() {
		return manager;
	}

	public Employee[] getSalesman() {
		return salesman;
	}

	public Employee[] getAnalyst() {
		return analyst;
	}

	public List<Employee> getList() {
		return list;
	}

	public List<Employee> getList2() {
		return list2;
	}

	public List<Employee>[] getList3() {
		return list3;
	}

	public List<Employee> getList4() {
		return list4;
	}

	public List<Employee> getLevel1() {
		level1.remove(0);
		return level1;
	}

	public List<Employee> getLevel2() {
		level2.remove(0);
		return level2;
	}

	public List<Employee> getLevel3() {
		level3.remove(0);
		return level3;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}
}

