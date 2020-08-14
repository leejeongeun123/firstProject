package com.yedam.classes;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Friend[] f1 = new Friend[2];
		boolean run = true;
		String name;
		int age;
		String num;

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.정보입력 2.리스트 3.이름조회  4.이름수정  9.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {

				for (int i = 0; i < f1.length; i++) {
					System.out.println("이름 입력.");
					name = scn.nextLine();

					System.out.println("나이 입력.");
					age = scn.nextInt();scn.nextLine();

					System.out.println("전화번호 입력.");
					num = scn.nextLine();
					
					f1[i] = new Friend(name, age, num);

				}

			} else if (selectNo == 2) {
				
				for(Friend f:f1) {
					System.out.println(f.getName());
				}

			} else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("종료.");
		scn.close();

	}

}
