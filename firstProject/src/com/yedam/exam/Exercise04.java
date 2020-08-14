package com.yedam.exam;

public class Exercise04 {
	public static void main(String[] args) {
	int sum =0;
		
	while(true) {
		
		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		System.out.println("(" + num1 + "," + num2 + ")");
		sum = num1 + num2;
		if (sum == 5) {
			System.out.println("주사위 합" + sum + "이므로 프로그램 종료");
			System.exit(0);
			}
	}

	}
}
