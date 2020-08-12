package com.yedam.cond;

public class IfExample {
	public static void main(String[] args) {
		int score = 80;
		String grade = "";
		
//		if(score >= 90) {
//			grade = "A";
//		} else if (score >= 80) {
//			grade = "B";
//		} else if (score >= 70) {
//			grade = "C";
//		} else {
//			grade = "D";
//		}
//		System.out.println("등급은" + grade + "입니다.");
		
		
		if(score >= 90) {
		grade = "A";
	} 	if (score >= 80) {
		grade = "B";
	} else if (score >= 70) {
		grade = "C";
	} else {
		grade = "D";
	}
	System.out.println("등급은" + grade + "입니다.");
	
	}
}
