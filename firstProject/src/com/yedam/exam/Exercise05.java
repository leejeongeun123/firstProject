package com.yedam.exam;

public class Exercise05 {
	public static void main(String[] args) {
		int num1;
		int num2;
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				num1 = x;
				num2 = y;
				if ((4 * x) + (5 * y) == 60)
					System.out.println(num1 + ", " + num2);
			}
		}
	}

}
