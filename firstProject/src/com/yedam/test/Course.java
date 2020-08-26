package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private List<Student> list = new ArrayList<>();

	public void add(Student s) {
		list.add(s);
	}
//	public void studentList() {
//		
//	 for(intnamn(list.get(i));
//	 }
//	 
//	 
//	 
//	}
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	
	
}
