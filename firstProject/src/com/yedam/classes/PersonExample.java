package com.yedam.classes;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "111";
		p1.setName("이정은");
		p1.setAge(25);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		Person cjy = new Person(); //name : 최재영, age:25 person class에 입력.
		cjy.setName("최재영");
		cjy.setAge(25);
		System.out.println(cjy);

		Person ksm = new Person();
		ksm.setName("김상민");
		ksm.setAge(26);
		Person ksm2 = new Person();
		ksm2.setName("김상민");
		ksm2.setAge(26);  //ksm, ksm2 같은 값이지만 주소값은 달라짐.
		System.out.println(ksm.getName() == ksm2.getName()); // 문자열 비교할 시 
//		System.out.println(ksm);
		
		System.out.println(cjy.introduce());
		System.out.println(ksm.introduce());
		
		Person[] pAry = {cjy, ksm, ksm2};
		
//		for (int i=0; i<pAry.length; i++)
//			pAry[i].introduce();
		Person anoy = new Person ("민해주");
		anoy.name ="최형준";
		anoy.age = 28;
		System.out.println(anoy.introduce());
		
		Person hsj = new Person("허성준", 20);
		hsj.setName("김시무");
		System.out.println(anoy.introduce());
		
	}
}
