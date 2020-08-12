package com.yedam.cond;

public class WhileExample2 {
	public static void main(String[] args) throws IOExcenption {

		boolean run = true;
		int num = 10;
		int keyCode = 0;
		while (run) {
			if (Keycode ! = 13 && keycode ! = 10) {
				System.out.println("키를 누르세요.");
				KeyCode = System.in.read();
//				if(keycode != 13)
					System.out.println(KeyCode);
			}
			if (keycode == 57)
				run = false;
//			System.out.println("num: " + num);
//			if(num-- == 0)
//				run = false; //break;
		}
		System.out.println("프로그램 종료.");
	}
}
