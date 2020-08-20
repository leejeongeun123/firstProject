package com.yedam.classes;

import java.util.Scanner;

public class Address2 {
	public static void main(String[] args) {
		
		//1. 정보입력 (이름, 나이, 전화번호)
		//2. 리스트
		//3. 이름조회
		//4. 이름조회 후 수정
		//9. 종료
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Friend[] ad = new Friend[100];
		//메뉴출력.
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.정보입력(이름,나이,전화번호) 2.리스트  9.종료");
			System.out.println("--------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scn.nextInt(); scn.nextLine();
			
			if(selectNo == 1) {
				System.out.println("이름 입력> ");
				String name = scn.nextLine();
				System.out.println("나이 입력> ");
				int age = scn.nextInt(); scn.nextLine();
				System.out.println("전화번호 입력> ");
				String phone = scn.nextLine();
				for(int i=0; i<ad.length; i++) {
					System.out.println(ad[i].name+","+ad[i].age+","+ad[i].num);
					ad[i] = new Friend(name, age, phone);
					
				}System.out.println();
			}
			else if(selectNo == 2) {
				
			}
			else if(selectNo == 9) {
				run = false;
			}
			
			
		}
	System.out.println("프로그램 종료.");	
		
	}
} //end of main()
