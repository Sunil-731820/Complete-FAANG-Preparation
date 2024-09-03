package com.java.dsa.OOPS;

public class Example {
	
	private int number;
	private String name;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	Defining the Method Which is Usedc to print the Details okay
	
	public void printDetail() {
		System.out.println("the Number is :"+number);
		System.out.println("the name is :"+name);
		
	}
	
	public static void main(String[] args) {
		System.out.println("this is The Example of the Testing the various method using Same class :");
		Example e1 = new Example();
		e1.setNumber(100);
		e1.setName("Sunil");
		e1.printDetail();
	}

}
