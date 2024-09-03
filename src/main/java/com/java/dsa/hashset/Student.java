package com.java.dsa.hashset;

public class Student {
	
	private int studentId;
	private String studentName;
	private int studentAge;
	private int studentSalary;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public int getStudentSalary() {
		return studentSalary;
	}
	public void setStudentSalary(int studentSalary) {
		this.studentSalary = studentSalary;
	}
	public Student(int studentId, String studentName, int studentAge, int studentSalary) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentSalary = studentSalary;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentSalary=" + studentSalary + "]";
	}
	
	

}
