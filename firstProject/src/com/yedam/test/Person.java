package com.yedam.test;

import java.util.HashSet;

public class Person {

	public String name;
	public int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() {
		return this.age;
		//return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.name.equals(p.name); //return this.name.equals(p.name);
//		return super.equals(obj);
	}
	
	
}
