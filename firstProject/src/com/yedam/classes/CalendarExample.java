package com.yedam.classes;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); // 2020-08-19
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); // 0부터 시작. ex)1월 = 0, 2월 = 1 , 월 : 0~11 까지 존재
//		System.out.println(cal.get(Calendar.DATE));

		cal.set(2020, 7, 32); // 2020년 0월 0일의 년도, 월, 요일정보
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println("날짜의 시작점" + ": " + cal.get(Calendar.DAY_OF_WEEK)); // 일요일 /토=7 1~7 1= 일
		System.out.println("날짜: " + cal.get(+Calendar.DATE));

		createCalendar(2020, 7);// 2020 8월 달력 보여주세요.

	}

	public static void createCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		System.out.println("일\t월\t화\t수\t목\t금\t토 ");
		
		int j = 1;
		
		for (int i = 1; i <++j; i++) {
			cal.set(year, month, i);
			//i==1 \
			if(cal.get(Calendar.MONTH)!=month) { //
				break;
			}
		if(i==1) {
			if (cal.get(Calendar.DAY_OF_WEEK) == 1) {// 1, 일요일때
				System.out.print(i+ "\t");
			} else if (cal.get(Calendar.DAY_OF_WEEK) == 2) {// 1, 월요일때
				System.out.print("\t" + i+ "\t");
			} else if (cal.get(Calendar.DAY_OF_WEEK) == 3) {// 1, 화요일때
				System.out.print("\t" + "\t" + i+ "\t");
			} else if (cal.get(Calendar.DAY_OF_WEEK) == 4) {// 1, 수요일때
				System.out.print("\t" + "\t" + "\t" + i+ "\t");
			} else if (cal.get(Calendar.DAY_OF_WEEK) == 5) {// 1, 목요일때
				System.out.print("\t" + "\t" + "\t" + "\t" + i+ "\t");
			} else if (cal.get(Calendar.DAY_OF_WEEK) == 6) {// 1, 금요일때
				System.out.print("\t" + "\t" + "\t" + "\t" + "\t" + i+ "\t");
			} else if (cal.get(Calendar.DAY_OF_WEEK) == 7) {// 1, 토요일때
				System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + i+ "\t");
			} 	
		}else {
			if(cal.get(Calendar.DAY_OF_WEEK) != 7) {
				System.out.print(i+"\t");
			}else {
				System.out.println(i);
			}
			
		}
		
		}//end for

	}//end createCalendar class
}
