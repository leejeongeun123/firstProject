package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		box.set(new String("Hello"));
		String result = box.get();
		
		Box<Person> box2 = new Box<>(); 
		box2.set(new Person());
		Person p1 = box2.get();
		
		Box<Person> box3 = Utils.boxing(new Person()); //box타입에 person클래스 
		
		Box<String> box4 = Utils.boxing(new String("hhh"));
		
		
		
		
		
		
//		Box box = new Box();
//		String str1 = new String("Hello");
//		box.set(str1);
//		String result = (String) box.get(); // Object 
//		
//		Person p1 = new Person();//다른타입 추가 패키지가 달라 import 사용
//		box.set(p1);
//		Person p2 = (Person) box.get();
//		
//		result = (String) box.get(); 
//		//run error .. 타입체크를 강하게 지정해주기 위해 제네럴 사용 
	}
}
