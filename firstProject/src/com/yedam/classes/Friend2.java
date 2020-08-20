package com.yedam.classes;

public class Friend2 {
	//필드
	private String name;
	private int age;
	private String phone; // 99-345-3456
	//생성자
	//생성자 오버로딩
//	public Friend2 (String name, int age, String phone) { 
//		this. name = name;
//		this. age = age;
//		this. phone = phone;
//	}
	public Friend2() {
	}
	//메소드
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "일반친구 이름 : " + this.getName() 
		+ ", 연락처 : " + this.getPhone() 
		+ ", 나이 : " + this.getAge();
	}
	
	
}
