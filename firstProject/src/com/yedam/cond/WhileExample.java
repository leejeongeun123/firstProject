package com.yedam.cond;

public class WhileExample {
	public static void main(String[] args) {

		// 구구단 while을 사용해서 출력.
		int i = 1;

		while (i < 10) {
			int j = 2;
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + i * j + '\t');
				j++;
			}
				i++;
		}
		// 1 ~ 10 값의 합 :
//		int i = 0;
//		int sum = 0;
//		while (i < 10) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("1 ~ " + i + " 까지 합 : " + sum);
	}
}
