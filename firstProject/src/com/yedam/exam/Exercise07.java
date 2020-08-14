package com.yedam.exam;

import java.util.Scanner;

import javax.rmi.CORBA.Util;

public class Exercise07 {
	private static int input;

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0; // 예금누적저장, 출금을하면 (-) 실행

		Scanner scanner = new Scanner(System.in); // System 객체에 사용자의 클릭으로 읽음

		while (run) { //run = 반복실행의미
			System.out.println("----------------------------");
			System.out.println("1.예금  2.출금  3.잔고  4.종료 "); // 사용자가 4.종료를 누르기 전까지 반복
			System.out.println("----------------------------");
			System.out.println("선택> ");
			int menu = scanner.nextInt(); // while 구문에 의해 4번 외에 반복실행

			if (menu == 1) { // 1번 입력 시 예금..
				System.out.println("예금 금액 입력하세요> ");
				input = scanner.nextInt();// 기존 balance에  + scanner.nextInt();구문/ 누적의미.
				balance = balance + input;
				//	balance = balance + scanner.nextInt(); // 기존 balance에  + scanner.nextInt();구문/ 누적의미.
				
			} else if (menu == 2) { // 출금..
				System.out.println("출금 금액을 입력하세요.");
				input = scanner.nextInt();
				balance = balance = input;
				
				
			} else if (menu == 3) { // 잔고..
				System.out.println("잔고선택");
				input = scanner.nextInt();
				balance = balance = input;
				
			} else if (menu == 4)
				run = false; // false = while 구문 종료

		} // end of while

		System.out.println("프로그램 종료");
	} // end of main
} // end of class
