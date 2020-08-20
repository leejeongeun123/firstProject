package com.yedam.classes;

import java.util.Scanner;

public class StringCharAtExample {
	public static void showGender(String str) {
		String[] sp = { "*","-","/"};
		String newStr = str;
		for (int i=0; i<sp.length;i++) {
			newStr = newStr.replace(sp[i], "");
		}
		System.out.println(newStr.charAt(6));
		switch(newStr.charAt(6)) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '2':
		case'4':
			System.out.println("여자입니다.");
			break;
		}
	
//	public static void main(String[] args) {
//		String str1 = "010102-345678";
//		System.out.println(str1.replace("-", "").charAt(6));
//		if(str1.replace("-", "").charAt(6)=='3') {
//			System.out.println("남자");
//		}
//		String str2 = "010102345678";
//		System.out.println(str2.replace("-", "").charAt(6));
//		
//		String ssn = "010624-1230123";
//		char sex = ssn.charAt(7);
//		subX("990205-1234567");
//		subX("010205/3234567");
//		subX("980205*2234567");
//		subX("0102054234567");
//		boolean run = true;
//		while(run) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("주민번호를 입력하세요> ");
//			String id = sc.next();
//			if(id.length()==14) {
//				subX(id);
//				
//			}else {
//				System.out.println("형식이 다릅니다.");
//				System.out.println("다시 입력하세요.");
//				continue;
//			}
//		}
//	}
//	
//	public static void subX(String id) {
//		Srting[] idx = id.split("-|/|\\*");
//		for(String name : idx) {
//			System.out.println(name);
//				
//			
//			
//			
//			}else if() { 
//				System.out.println();
//			}
//			
//		}
//		
////		public static void subX(String id) {
////			String idx = id;
////			
////		}
//		
//		
//		switch (sex) {
//		case '1' :
//		case '3' :
//			System.out.println("남자입니다.");
//			break;
//		case '2':
//		case'4':
//			System.out.println("여자입니다.");
//			break;
//			
//			
//		}
//	}
//
//	private static void subX(String string) {

	}
}
