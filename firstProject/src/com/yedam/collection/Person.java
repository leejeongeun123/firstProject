package com.yedam.collection;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return this.age - o.age; //음수(오름차순), 앞에있는 값(this.age)보다 뒤에있는 값(o.age)이 작으면 음수.
								// 양수(내림차순), o.age - this.age;
	}
	
	
}
