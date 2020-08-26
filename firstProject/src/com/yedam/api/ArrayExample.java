package com.yedam.api;

import java.util.Arrays;
class User {
	String name;
	int grade;
	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
//	@override
//	public int compareTo
}
public class ArrayExample {
	public static void main(String[] args) {
		int[] scores = {95, 80, 36, 88 };
		
		String[] names = {"Hong", "Park", "Choi"};
		System.out.println("------------정렬전---------------");
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println("------------정렬후---------------");
		Arrays.sort(names);
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println("===================");
		User[] users = {new User("user1", 1), new User("user2", 2), new User("user3", 3)};
		Arrays.sort(users); 
		for (User s : users) {
			System.out.println(s);
			
			
			
		// user3, user2, user1 =>순서대로 나오도록.
		// Arrays - 정렬
		
		}
		
		//		names => "Choi", "Hong", "Park"
		
		
	}
}
