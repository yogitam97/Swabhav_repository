package com.techlabs.treeset;

import java.util.Comparator;

import com.techlabs.collection.set.*;
public class SortUsingLastName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int nameresult=o1.getLastName().compareTo(o2.getLastName());
		return  ((nameresult==0) ?
				o1.getLastName().compareTo(o2.getLastName()): nameresult);
	}

}

