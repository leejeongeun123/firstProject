package com.yedam.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal anm = new Animal(); //추상클래스 인스턴스 생성불가.
		Animal anm = new Cat();
		anm.breathe();
		anm.sound();
		
		anm = new Dog();
		anm.breathe();
		anm.sound();
		
		int a = 10;
		double b = a; //promotion
		a = (int) b; //casting
		
		Dog dog = (Dog) anm;
		dog.sound();
	}
}
