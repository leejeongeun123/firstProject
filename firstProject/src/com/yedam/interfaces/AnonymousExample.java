package com.yedam.interfaces;

class Anonymous {
	void run() {
		System.out.println("실행.");
	}
	
}


//public class AnonymousExample {
//	public static void main(String[] args) {
//		AnonymousExample anonym = new AnonymousExample() {
//			String str;
//			
//			@Override
//			void run() {
//				System.out.println("자식 실행.");
//			}
//		};
//		anonym.run();
//	}
//}
//
//interface AnonymInterface {
//	void run();
//}
//
//public class AnonymousExample {
//	public static void main(String[] args) {
//		AnonymInterface anonymIntf = () -> {
//			{System.out.println("자식 구현 객체 실행.");
//		}
//			
//		};
//		anonymIntf.run();
//		Anonymous anonym = new Anonymous() {
//			String str;
//		}
//		anonym.run();
//	}
//}
