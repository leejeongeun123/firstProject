package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	static List<Student> list =new ArrayList<>();
	
	public static void main(String[] args) {
		// 1)학생이름, 수학점수, 영어점수를 입력받고( 3명이상)
		// 2)수학평균, 영어평균 계산하는 분석
		// 3)수학최고점수와 학생을 보는 최고점수
		// 9)종료.
		// 프로그램을 작성하세요
		// ArrayList를 사용.

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int[] scores = null;
		
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.학생 2.과목평균 3.최고점수 9.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");

			int selectNo = scn.nextInt();
			if(selectNo == 1) {
				System.out.print("학생이름 입력");
				String studentName = scn.next();
				System.out.print("수학점수 입력");
				int Mathscore =scn.nextInt();
				System.out.print("영어점수 입력");
				int Englishscore =scn.nextInt();
				
				System.out.println("이름: " +studentName + "수학점수:" + Mathscore + "영어점수:" +Englishscore);
				
				list.add(new Student (studentName, Mathscore, Englishscore));

				
			}
		}
	}
}
