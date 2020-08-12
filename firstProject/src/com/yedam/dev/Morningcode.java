package com.yedam.dev;

public class Morningcode {
	
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "world";
		String name = "이정은";
		System.out.println(str1 + ", " + name);
		
		int v1 = 150, v2 = 270;
		int result = add(v1, v2);
		System.out.println("결과값 : "+ result);
	
		introduce("홍길동");
		
		result = minus(v1, v2);
		System.out.println("결과는" + result);
	}
	
	// minus 메소드 정의..
	public static int minus(int a, int b) {
		return a - b;
	}
	
	public static void introduce(String name) {
		System.out.println("안녕하세요. 저는" + name + "입니다.");
	}
	
	public static int add ( int x, int y) { // method 정수형 타입 2 개를 
		int sum = x + y;
		return sum;
	}
}
