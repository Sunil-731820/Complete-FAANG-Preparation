package com.java.Beg;

public class Student {
	
	int id;
	String name;
	int age;
	double marks;
	public Student(int id, String name, int age, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	
//	Method to display the Student Details Okay 
	
	void display() {
		System.out.println("Student id : "+id + "name :"+name + "Age :"+age + "marks :"+marks);
	}

}
