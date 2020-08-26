package com.yedam.ref;

import java.util.HashSet;
import java.util.Set;

import com.yedam.test.Person;

public class Example06 {
	public static void main(String[] args) {
		// 배열의 크기 3;
		// 1~6까지의 임의의 숫자가 반복되지 않도록 배열에 저장해 보세요.

		int[] intAry = new int[3];
//1		for (int i = 0; i < intAry.length;) {
//			int randomNum = (int) (Math.random() * 6) + 1;
//			if (intAry[i] != randomNum) {
//				intAry[i] = randomNum;
//				i++;
//		System.out.print(i);	}
//		}

//2		
//		int cnt = 0;
//		while(true) {
//			int temp = (int) (Math.random() * 6) + 1;
//			for (int i = 0; i < intAry.length; i++) {
//				if(intAry[i] != temp) {
//					intAry[cnt] = temp;
//				}
//			}
//			if (cnt == 3)
//				break;
//			else
////				intAry[cnt++]
//		}
//		System.out.println();
		
//3		Collection 활용.
//		Set<Integer> set = new HashSet<>();
//		while (true) {
//			int temp = (int) (Math.random() * 6) + 1;
//			set.add(temp);
//			if (set.size() == 3)
//				break;
//		}
//		for (Integer it : set) {
//			System.out.println(it);
//		}
		
		Set<Person> pSet = new HashSet<>();
		pSet.add(new Person("Hong1", 20)); //hashCode, equals
		pSet.add(new Person("Hong2", 21));
		pSet.add(new Person("Hong1", 20));
		
		for (Person p : pSet) {
			System.out.println(p.name + ", " + p.age); 
			//1. //System.out.println(p.name + ", " + p.age + ", " + p.toString());
					
		}
	}
}
