package com.yedam.classes.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Account[] a1 = new Account[100];
		boolean run = true;
		int balance = 0;
		String name;

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성  2.계좌목록  3.예금  4.출금  5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();

			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("계좌주 : ");
		String owner = scanner.next();

		System.out.print("초기 입금액 : ");
		int balance = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("-------------------");
				System.out.println("계좌가 생성되었습니다.");
				System.out.println("-------------------");
				System.out.println("계좌번호 : " + accountArray[i].getAno());
				System.out.println("계좌주 : " + accountArray[i].getOwner());
				System.out.println("초기입금액 : " + accountArray[i].getBalance());
				break;
			}

		}
	}

	private static void accountList() {
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.print("계좌번호: " + account.getAno() + "   ");
				System.out.print("계좌  주 : " + account.getOwner() + "   ");
				System.out.print("초기금액 : " + account.getBalance());
				System.out.println();

			} else {
				break;
			}
		}

	}

	private static void deposit() {

		System.out.println("---------");
		System.out.println("예금하기");
		System.out.println("---------");

		System.out.print("계좌번호> ");
		String ano = scanner.next();

		// findAccount(): ano(계좌주)와 동일한 Account 객체 는 함수
		Account account = findAccount(ano);

		System.out.print("예금액> ");
		int money = scanner.nextInt();

		if (account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다...");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println(money + "원이 예금 되었습니다.");

	}

	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금하기");
		System.out.println("---------");

		System.out.print("계좌주> ");
		String ano = scanner.next();
		System.out.print("출금액> ");
		int money = scanner.nextInt();

		// findAccount(): ano(계좌번호)와 동일한 Account 객체 는 함수
		Account account = findAccount(ano);
		//int curBalance = acnt.getBalance(); //현재잔액
		if (account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다...");
			return;
		}

		account.setBalance(account.getBalance() - money);
		System.out.println(money + "원이 출금 되었습니다.");
	}

	private static Account findAccount(String ano) {
		Account account = null;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano))
				account = accountArray[i];

		}

		return account;
	}
}
