package com.yedam.classes;

public class Student {
	//필드(속성) private - 외부에 노출하지 않고 접근 / 동일한 package일 경우 접근 가능하도록
		private int studNo;
		private String studName;
		private String Major;

		//생성자 (초기값)
	public Student() {
		
	}
	public Student(int studNo) {
		this.studNo = studNo;
	}
	public Student (int studNo, String studName, String Major) {
		this.studNo = studNo;
		this.studName = studName;
		this.Major = Major;
	}
		//메소드(기능, 동작)
		
	public void setStudNo (int studNo) {
		this.studNo = studNo;
	}
	public void setStudname(String studName) {
		this.studName = studName;
	}
	public void setMajor(String major) {
		this.Major = Major;
	}
	public int getStudNo() {
		return studNo;
	}
	public String getStudName() {
		return studName;
	}
	public String getMajor() {
		return Major;
	}

	@Override
	public String toString( ) {
		return "학번은 " + studNo + ", 이름은 " + studName + ", 전공은 " + Major; 
	}

}
