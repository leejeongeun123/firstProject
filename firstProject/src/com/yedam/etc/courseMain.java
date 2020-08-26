package com.yedam.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class courseMain {

	public static void main(String[] args) {

		boolean run = true;
		Scanner scn = new Scanner(System.in);
		List<student> list = new ArrayList<>();

		while (run) {
			System.out.println("-------------");
			System.out.println("1.등록 2.조회 3.삭제");
			System.out.println("--------------");
			System.out.print("선택 > ");

			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				System.out.print("이름입력 > ");
				String name = scn.next();
				System.out.print("나이입력 > ");
				int age = scn.nextInt();
				System.out.print("번호 > ");
				String num = scn.next();

				// int[] a = new int[3];
				list.add(new student(name, age, num));

			} else if (selectNo == 2) {

				for (student str : list) {
					System.out.println(str.getName() + "," + str.getAge() + "," + str.getNum());
				}

			} else if (selectNo == 3) {// 삭제
				System.out.print("삭제할 학생 이름 입력> ");
				String delName = scn.next();

				for (int i = 0; i < list.size(); i++) {
					if (delName.equals(list.get(i).getName())) {
						
						list.remove(i);
					}

				}

			}
		}
		System.out.println("프로그램종료");
	}
}
