package com.yedam.classes.statics;

public class Singleton {
	private static Singleton singleton = new Singleton(); //static 클래스단위 제한, private - Singleton 외부에서는 접근이 불가하도록 제한 
	
	private Singleton( ) {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
