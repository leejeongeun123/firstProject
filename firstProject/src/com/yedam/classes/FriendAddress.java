package com.yedam.classes;

import java.util.Scanner;

public class FriendAddress {
	static Scanner scn = new Scanner(System.in);
	static Friend2[] friends = new Friend2[100];
	
	public static void main(String[] args) {

			
	while(true){
		System.out.println("-------------------------------------");
		System.out.println("1.학교친구  2.회사친구  3.친구  4.리스트  9.종료");
		System.out.println("-------------------------------------");
		System.out.println("선택> ");

		int selectNo = scn.nextInt();
		if (selectNo == 1) {
			addUnivFriend();
		} else if (selectNo == 2) {
			addComFriend();
		} else if (selectNo == 3) {
			addFriend();
		} else if (selectNo == 4) {
			FriendList();
		} else if (selectNo == 9) {
			break;
		}
	}System.out.println("프로그램 종료.");

	} // end of main()

	// 회사친구등록 메소드.
	public static void addComFriend() {
		 
			System.out.println("회사친구등록");
			System.out.print("이름 : ");
			String name = scn.next();
			System.out.print("전화 : ");
			String phone = scn.next();
			System.out.print("회사 : ");
			String major = scn.next();
			
			
			ComFriend friend = new ComFriend();
			friend.setName(name);
			friend.setPhone(phone);
			friend.setComName(major);
			
			
			for(int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					break;
				}
			}
	}

	// 학교친구등록 메소드.
	public static void addUnivFriend() {
		System.out.println("학교친구등록");
		System.out.print("이름 : ");
		String name = scn.next();
		System.out.print("전화 : ");
		String phone = scn.next();
		System.out.print("전공 : ");
		String major = scn.next();

		UnivFriend friend = new UnivFriend();
		friend.setName(name);
		friend.setPhone(phone);
		friend.setMajor(major);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}

		}
	} // end addUnivFriend

	public static void FriendList() {
		for (Friend2 friend : friends) {
			if (friend != null)
				System.out.println(friend.toString());
		}
	}// end FriendList

	//일반친구 등록
	public static void addFriend() {
		System.out.println("일반친구등록");
		System.out.print("이름 : ");
		String name = scn.next();
		System.out.print("연락처 : ");
		String phone = scn.next();
		System.out.print("나이 : ");
		int age = scn.nextInt();

		Friend2 friend = new Friend2();
		friend.setName(name);
		friend.setPhone(phone);
		friend.setAge(age);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}

		}
	}// end addFriend

}
