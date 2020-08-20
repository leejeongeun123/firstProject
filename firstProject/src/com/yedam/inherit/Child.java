package com.yedam.inherit;

public class Child extends Parent{
	private int grade;
	
	public Child(String name, int age) {
		super(name, age);
	}
	
	//name,age
	public Child(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
