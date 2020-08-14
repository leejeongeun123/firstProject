package com.yedam.classes;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(111, "홍길동", "역사"); 
		// student객체생성 --> student클래스의  내용을 호출해올수있음.

//		s1.studNo = 111;
//		s1.setStudNo(111); // set
//		s1.studName = "홍길동";
//		s1.Major = "역사";
		System.out.println("학번은" + s1.getStudNo());
		System.out.println("이름은" + s1.getStudName());
		System.out.println("전공은" + s1.getMajor());

		Student s2 = new Student(222, "김유신", "말타기");
		System.out.println("학번은" + s2.getStudNo());
		System.out.println("이름은" + s2.getStudName());
		System.out.println("전공은" + s2.getMajor());

		Student s3 = new Student(333, "최재영", "역사");
		Student s4 = new Student(444, "민해주", "말타기");

		String searchName = "김유신";
		String searchMajor = "역사";

		Student[] sAry = { s1, s2, s3, s4 };
		
		for (Student s : sAry) { // 배열만큼 반복 ex. s1, s2 2번반복
			if (s.getMajor().equals(searchMajor)) {
				//if(true)
				System.out.println(s.toString());
			}
		}

	}
}
