package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 10; // 2진수 변경시 00001010
		int v2 = ~v1; // 
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + (v2+1));
		
		byte b1 = 10;
		byte b2 = 4;
		int b3 = b1 % b2;  // +, -, % 산술연산 결과값은  int 
		
		double result = 10 / 4.0; // 2.5출력 /double = 소수점까지 출력 double result = 10 / 4; 입력 시 2.0출력. 
		 System.out.println(result);
	}
}
