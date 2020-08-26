package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");
		
		SortedMap<Student, String> sMap = tMap.headMap(new Student ("Base", 80, 88)); // 80점 이하 학생
		Set<Student> set = sMap.keySet();
		for (Student s : set) { 
			System.out.println(s.getName() + ", " + s.getMathScore());
		}
		
		sMap = tMap.tailMap(new Student("Esab", 80, 80)); //80점  이상 학생
		Set<Student> set1 = sMap.keySet();
		for (Student s : set1) {
			System.out.println("이상"+s.getName() + ", " + s.getMathScore() + ", " + s.getEngScore());
		}
		
		
		sMap =tMap.subMap(new Student ("Base", 70, 70),new Student ("Base", 80, 88)); //70에서 80사이 학생 출력
		Set<Student> set2 = sMap.keySet();
		for (Student s : set2) {
			System.out.println("70-80사이"+s.getName() + ", " + s.getMathScore());
		}
		
		
		
//1. 80점 이하 학생 구하기.
//		SortedMap<Student, String> sMap = tMap.headMap(new Student ("Base", 80, 88));
//		Set<Student> set = sMap.keySet();
//		for (Student s : set) {
//			System.out.println(s.getName() + ", " + s.getMathScore());
//		}
	}
}
