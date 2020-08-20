package com.yedam.generic;

public class Box<T> { //box 클래스 타입은 Object 모든 타입 받을 수 있음. 최상위 부모클래스.
	//<T> T 가 정해지면 변경가능 
	private T obj;
	
	public void set(T obj) { //set을 통해 값을 받음
		this.obj = obj;
	}
	public T get() {
		return this.obj;
		
		
//		private Object obj;
//		public void set(Object obj)
//		public Object get() {	
	}
}
