package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
//		Calculator cal = new Calculator();
		
		System.out.println("10+20 = " + Calculator.add(10, 20));
		System.out.println("10.0+20.0 = " + Calculator.add(10.0, 20.0));
		
		double r1 = 3.5;
		Calculator.getArea(r1);
		
		System.out.println(Calculator.getRectangle(4, 5));
		
		
		// => 가로 4, 세로 5의 넓이는 20입니다.
	}
}
