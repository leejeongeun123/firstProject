package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));
		
		Integer t = tSet.first();	// 가장작은값
		t = tSet.last();	//가장 큰값
		t = tSet.floor(new Integer(87));	//<= 87  포함
		t = tSet.lower(new Integer(87));	// <= 87 제외
		t = tSet.ceiling(new Integer(85)); // >= 크거나 같다.
		t = tSet.higher(new Integer(85)); // > 
		
		Iterator<Integer> dIter = tSet.descendingIterator(); // 반복자 타입<클래스>
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		
		System.out.println("------------------------------------");
		
		NavigableSet<Integer> nSet = tSet.descendingSet(); //리턴타입 Set , 역순
		for(Integer icnt : nSet) { 
			System.out.println(icnt);
		}
		
		//요소를 가지고 와서 삭제
		int size = tSet.size();
		for (int i = 0; i < i; i++ ) {
		t = tSet.pollLast(); // pollFirst = 값을 하나씩 인출 // Last = 큰값부터 
		System.out.println(t + ", " + tSet.size());
		}
		
		Iterator<Integer> iter = tSet.iterator();
		while(iter.hasNext()) { //hasNext 값이 있으면 실행 없으면 종료
			Integer icnt = iter.next();
			System.out.println(icnt);
			
		}
		
	}
}
