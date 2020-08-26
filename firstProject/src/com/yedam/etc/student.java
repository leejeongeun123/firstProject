package com.yedam.etc;

public class student {
	String name;
	int age;
	String num;
	 
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public student(String name, int age, String num) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
	}
	
	
}
