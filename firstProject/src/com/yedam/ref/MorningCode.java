package com.yedam.ref;

public class MorningCode {
	public static void main(String[] args) {
		double[] dAry = new double[5];
		dAry[0] = 1.2;
//		for(int j = 0; j<6; j++) {
//			System.out.println(dAry[j]);
//		}

		int[][] iAry = new int[5][5];
		int num1 = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				iAry[i][j] = num1++;
			}
		}

		int result = iAry[0][0];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", iAry[i][j]); // %= 뒤의 값을 받아 );
			}
			System.out.println();
		}
		System.out.println("-------------------------");

		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", iAry[j][i]); 
			}
			System.out.println();
		}

	}
}
