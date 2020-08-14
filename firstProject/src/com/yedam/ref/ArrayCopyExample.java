package com.yedam.ref;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] { 3, 6, 9, 2, 4 };

		int[] cpyAry = new int[5];

//		for(int i=0; i < origAry.length; i++) {
//			cpyAry[i] = origAry[i];
//		}
		System.arraycopy(origAry, 0, cpyAry, 1, 4);
		// System.arraycopy(origAry, 첫번째 0, cpyAry(복사할대상), 1, 4); 첫번째 0부터 1번위치에서 4개만 잘라서
		// 검색하겟다.

		for (int i = 0; i < origAry.length; i++) {
			System.out.println(cpyAry[i]);
		}
		for (int num : cpyAry) { // cpyAry int타입을 num에 값을 담아 출력
			System.out.println(num);
		}
		System.out.println(cpyAry);
	}
}
