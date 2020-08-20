package com.yedam.classes.exam;

import java.util.Scanner;

public class test1 {

	private static test2[] accountArray = new test2[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.계좌생성  2.계좌목록  3.예금  4.출금 5.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();

			}
		}

	}

	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("계좌주 : ");
		String owner = scanner.next();

		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();

		System.out.println("계좌생성되었습니다.");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new test2(ano, owner, balance);
				break;
			}
		}
	}

	private static void accountList() {
			System.out.println("---------");
			System.out.println("계좌목록");
			System.out.println("-------");
			
			for(int i = 0; i <accountArray.length; i++) {
				if ( accountArray[i] != null) {
					System.out.println(accountArray[i].getAno() +'\t'+ accountArray[i].getOwner() +'\t'+accountArray[i].getBalance());

					
					
				}
		}
	}

}
