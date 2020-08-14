package com.yedam.classes;

public class Friend {

	 String name;
	 int age;
	 String num;

	public Friend() {

	}

	public Friend(String name) {
		this.name = name;
	}

	public Friend(String name, int age, String num) {
		this.name = name;
		this.age = age;
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

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	
	

	
}
