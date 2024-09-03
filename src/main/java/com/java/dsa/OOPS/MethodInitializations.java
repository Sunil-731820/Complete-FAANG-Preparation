package com.java.dsa.OOPS;import javax.swing.border.SoftBevelBorder;

public class MethodInitializations {
	
	static String softwwarename ;
	static float softwarePrice;
	
	
	static void set(String name,float price) {
		softwwarename = name;
		softwarePrice = price;
	}
	
	static void get() {
		System.out.println("The Softare name is :="+softwwarename);
		System.out.println("The price is :="+softwarePrice);
	}
	
	public static void main(String[] args) {
		System.out.println("This is The EXample of The Method InitializationAnd Declarrations : =");
	MethodInitializations m1 = new MethodInitializations();
	m1.set("VS Code", 200);
	m1.get();
	
	}

}
