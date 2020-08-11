package com.yedam.dev;

public class IntExample {
	public static void main(String[] args) {
		int b = 0;
		int sum = 0;
		for (int i=0; i<10; i++) { // i = i + 1;
			int result = 0;
			b = b + 1; //b++
			sum = sum + b; 
			System.out.println("sum =" + sum + ", b = " + b);
			//sum += b;
		}
		System.out. println("합계 : " + sum);
		int i = 0;
		sum =10;
	}
}
