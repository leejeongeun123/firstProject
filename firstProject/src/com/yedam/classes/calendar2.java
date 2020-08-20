package com.yedam.classes;

import java.util.Calendar;

public class calendar2 {
	public static void main(String[] args) {
		createCalendar(2020, 8);
	}

	public static void createCalendar(int year, int month) { // 메인 메소드와 타입 맞춰줌 static
		// 2020년 8월 달력

		System.out.println("  일   월   화   수    목   금   토");
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%3s", "");
		}
		int day = 1;
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%3d", day);
			if ((day + firstDay - 1) % 7 == 0) {
				System.out.println();
			}
			day++;
		}

	}
}
