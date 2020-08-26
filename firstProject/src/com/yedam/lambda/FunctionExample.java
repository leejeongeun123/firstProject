package com.yedam.lambda;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<String, String> func1 = (str) -> {
			return str + "is nothing";
		};
		String result = func1.apply("something");
		System.out.println(result);

		Function<String,Integer> fun2 = (str) -> {
			return str.length();
		};
		int len = fun2.apply("Hello");
				System.out.println(len);
	}
}
