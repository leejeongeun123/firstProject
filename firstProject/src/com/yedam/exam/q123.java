package com.yedam.exam;

import java.util.Scanner;

public class q123 {
	private static int input;

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0; // 예금누적저장, 출금을하면 (-) 실행

		Scanner scanner = new Scanner(System.in); // System 객체에 사용자의 클릭으로 읽음

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금  2.출금  3.잔고  4.종료 "); // 사용자가 4.종료를 누르기 전까지 반복
			System.out.println("----------------------------");
			System.out.println("선택> ");
			int menu = scanner.nextInt(); // while 구문에 의해 4번 외에 반복실행

			if (menu == 1) { // 1번 입력 시 예금..
				System.out.println("예금 금액 입력하세요> ");
				input = scanner.nextInt();
				balance = balance + input;

			} else if (menu == 2) { // 출금..
				System.out.println("출금 금액을 입력하세요.");
				input = scanner.nextInt();
				balance = balance = input;

			} else if (menu == 3) { // 잔고..
				System.out.println("잔고" + balance);
				break;

			} else if (menu == 4)
				run = false; // false = while 구문 종료

		}

		System.out.println("프로그램 종료");
	}
}