package com.yedam.lambda;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	int[] n = new int[3];
	int[] guess = new int[3];
	boolean[] already = new boolean[10];
	int strike, ball;
	
	for (int i = 0; i < 10; i ++) {
		already[i] = false;
	}
	int count = 0;
	while (count < 3) {
		int trial = ran.nextInt(10);
		if (!already[trial]) {
			n[count] = trial;
			already[trial] = true;
			count++;
			
		
		}
	}
		
	}
	
}
