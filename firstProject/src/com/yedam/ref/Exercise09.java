package com.yedam.ref;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null; //scores - 배열의 크기를 정하는 값
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("------------------------------------");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();
			// scn.nextInt(); 사용자로 하여금 선택번호 값을 받고 selectNo에 따라서 다르게 처리 
			
			if(selectNo == 1) { //배열의 크기를 정하도록.
				//작성 위치
				System.out.println("학생수 입력하세요.");
				studentNum = scn.nextInt();
				scores = new int [studentNum]; //new int[5] 배열의 크기가 들어가는데 9번행 들어감.
				System.out.println("학생 수 : " + studentNum);
				
			} else if ( selectNo == 2) { //배열의 크기만큼 입력.
				//작성 위치
				System.out.println("점수 입력.");
				for (int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> " );
					scores[i] = scn.nextInt();
				}
				
			} else if (selectNo == 3 ) {
				//작성위치
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] " + scores[i]);
				}
				
			} else if ( selectNo == 4) { // 분석 : 평균, 최고점수 
				//작성 위치
				int sum = 0;
				double avg = 0;
				int maxValue = 0;
				
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if(maxValue < scores[i])
						maxValue = scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println("최고점수 : " + maxValue);
				System.out.println("평균 %.2f : " + avg); //소수점2번째까지 표시
				
				
			} else if ( selectNo == 5) {
				run = false; //while(run) 이 ture가 아니면 종료
			}
	}
		System.out.println("프로그램 종료.");
		scn.close();
	}
	}
