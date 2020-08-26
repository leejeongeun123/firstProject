package com.yedam.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	
public class CourseMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		Course c1 = new Course("javaCourse");
		
		Student s1 = new Student("홍길동", 10, 10);
		Student s2 = new Student("이정은", 50, 10);
		Student s3 = new Student("이광호", 50, 20);
		c1.add(s2);
		c1.add(s3);
		c1.add(s1);
		showCourseInfo(c1);
	}
	public static void showCourseInfo(Course c) {
		System.out.println(c.getCourseName());
		for(Student s: c.getList()) {
			System.out.println(s.getName()+"/"+s.getAge()+"/" +s.getGrade());
		}
	}
		
	
}
