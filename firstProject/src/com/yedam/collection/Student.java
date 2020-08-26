package com.yedam.collection;

public class Student implements Comparable<Student> {
	private String name;
	private int MathScore;
	private int engScore;
	
	public Student(String name, int MathScore, int engScore) {
	this.name = name;
	this.MathScore = MathScore;
	this.engScore=engScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathScore() {
		return MathScore;
	}

	public void setMathScore(int MathScore) {
		this.MathScore = MathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

//	@Override
//	public int compareTo(Student o) {
//		return this.MathScore - o.MathScore;
//	}
//	
	@Override
	public int compareTo(Student o) {
		return this.MathScore - o.MathScore;
	}
	
}

			

