package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Hong1", 10));
		set.add(new Person("Hong2", 14));
		set.add(new Person("Hong3", 12));
		set.add(new Person("Hong4", 11));
		//.Comparable 크다 작다 기준을 설정하기위해 Person에 작성
		
		SortedSet<Person> sSet = set.headSet(new Person("Sorted", 12)); //.headSet 작은값이 출력되도록 함. ex) hong12,11,10
		sSet = set.tailSet(new Person("So", 12));
		sSet = set.subSet(new Person("Temp",10), new Person("Temp2", 12)); //범위를 가져올땐 .subSet / (앞에있는 값은 포함 뒤는 제외.)
		 for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println("-----------------------------------------");
		NavigableSet<Person> nSet = set.headSet(new Person("Sorted",12), false);
		nSet = set.tailSet(new Person("Sorted", 12), false);
		set.subSet(new Person("SSS", 10), true, new Person("TTT", 12), true);
		for (Person person : nSet) {
		System.out.println(person.name + ", " + person.age);
		}
		
		Iterator<Person> iter = set.iterator();
		
		while(iter.hasNext()) {
//			System.out.println(iter.next().name + ", " + iter.next().age);
			
			//		set.add(new Person("Hong4", 11)); 입력 추가,
			// System.out.println(iter.next().name + ", " + iter.next().age); =  hong 2, 4 출력, next로 인해 출력값오류 
		}
	}
}
