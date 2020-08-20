package com.yedam.classes;

public class Calculator {
	private static double pi = 3.14;

	// 가로, 세로 => 넓이를 반환해주는 메소드 (getRectagle)
	// 가로 4, 세로 5의 넓이는 20입니다.

	public static String getRectangle(int x, int y) {
		int q = x * y;

		return "가로" + x + ", 세로" + y + "의 넓이는"
		+ getRectangle(x, y) + "입니다.";
	}

	public static int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static void getArea(double a) {
		double result = pi * a * a;
		System.out.println("반지름 " + a + "의 넓이는 " + result);

	}

}
