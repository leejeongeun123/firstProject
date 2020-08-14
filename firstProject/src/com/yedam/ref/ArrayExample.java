package com.yedam.ref;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		score2 = 50; // 20이 담겨있지만 다시 입력하면 값 50으로인식
		int sum = score1 + score2 + score3 + score4;
		
		int[] intAry = { 10, 20, 30, 40, 50, 60, 70, 90, 10, 20 };
//		sum = intAry[0] + intAry[1] + intAry[2] + intAry[3]; //[0] = 10, [1] = 20 ..등 
		intAry[1] = 50; //2번째 위치 20을 50으로 변경한다는 의미 
		System.out.println(intAry.length); //intAry.length 늘어난 개수 만큼 출력
		
		sum = 0;
		for(int i = 0; i<intAry.length; i++) { // i값을 위 intAry 0,1,2,3으로 출력 
			System.out.println(intAry[i]);
			sum = sum + intAry[i];
			
		}
		System.out.println("sum : " + sum);
		
		double[] dAry = {2.3, 4.3};
		
		String[] sAry = { "Hello", "world", "nice", "good" };
		for (int p = 0; p < sAry.length; p++) {
			System.out.println(sAry[p]);
			
		String[] scoreAry = new String[5];
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
			
		int[] mathAry;
		mathAry = new int[] { 1, 2, 3, 4};
			
			
			
		}
		
	}

}
