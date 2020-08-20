package com.yedam.generic;

public class Container<T, K> {
	T key;
	K value;
	public T getKey() {
		return key;
	}
	public K getValue() {
		return value;
	}
	
	public void set(T t, K k) {
		this.key = t;
		this.value = k;
	}
	
}
