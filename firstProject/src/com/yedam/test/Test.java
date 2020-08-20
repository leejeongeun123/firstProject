package com.yedam.test;

import java.util.Scanner;

public class Test {
	private static Test01[] accountArray = new Test01[100];
	private static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("************************************");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4. 출금 5.종료");
			System.out.println("************************************");
			System.out.print("선택> ");

			int num = sn.nextInt();

			if (num == 1) {
				createAccount();
			}

		}
	}

	public static void createAccount() {
		System.out.println("-----");
		System.out.println("계좌생성");
		System.out.println("-----");
		System.out.print("계좌번호");
		String ano = sn.next();
		System.out.print("계좌주");
		String owner = sn.next();
		System.out.print("초기 입금액");
		int balance = sn.nextInt();
		System.out.println("결과 : 계좌가 생성되었습니다.");
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i] = new Test01(ano, owner, balance);
			break;
		}
	}
}
