package com.yedam.lambda;

//함수적인인터페이스(functional Interface)

interface MyFunctionalInterface {
	public void run(); // 추상메소드(abstract method)
}

class MyFuncClass implements MyFunctionalInterface {
	@Override
	public void run() {
		System.out.println("ruuuuuun.");
	}
}

public class LambdaExample {
	public static void main(String[] args) {
		MyFunctionalInterface myintf = () -> {
			System.out.println("runn.");
		};
		myintf.run();
	
	
	
	ShowContent sc = (content) -> {
			System.out.println("내용은" + content + " 입니다.");
	};
	sc.show("바나나");
	

//	ShowConent sc2 = new ShowContent() { // this is 바나나.
//	 @Override
//	 public void show(String content) {
//		 System.out.println("this is "+ content);
//	 };
//	람다식 변경  
//	 ShowContent sc2 = (content) -> {
//		 System.out.println("this is "+ content);
//	 };
//	 sc2.show("바나나");
	 
	 
	 
	 
	 
//	 Calculate cal = new Calculate() {
//		 @Override
//		 public int sum(int a, int b) {
//			 return a+ b
	//람다식변경
	 Calculate cal = (a, b) -> a + b;
	 System.out.println("결과 : " + cal.sum(10, 5));
	 	 cal.sum(10,5);
					 
		 }
	 }
	 
	 
	 
	 

