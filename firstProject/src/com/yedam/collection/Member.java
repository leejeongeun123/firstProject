package com.yedam.collection;
//com.yedam.classes.exam.Member
//com.yedam

public class Member {
	private String name;
	private int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//hashcode, equals 활용. 논리적으로 동일한 객체.

	@Override
	public int hashCode() {
		return this.age;
//		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
//		return true;
//		return super.equals(obj);
	}	
	

}
