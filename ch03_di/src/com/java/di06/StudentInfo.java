package com.java.di06;

import java.util.HashMap;
import java.util.Iterator;

public class StudentInfo {
	private HashMap<String, Student> studentList;

	public StudentInfo() {
		super();
	}

	public StudentInfo(HashMap<String, Student> studentList) {
		super();
		this.studentList = studentList;
	}

	public void setStudentList(HashMap<String, Student> studentList) {
		this.studentList = studentList;
	}

	
	
	
	
	public void print() {
		Iterator<String> iterator=studentList.keySet().iterator();
		
		while(iterator.hasNext()) {
			String key=iterator.next();
			
			Student student = studentList.get(key);
			System.out.println(student.toString());
		}
	
	}

}
