package com.yedam.classes.statics;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("동일한 instance입니다.");
		} else {
			System.out.println("다른 instance입니다.");
		}
	}
}
