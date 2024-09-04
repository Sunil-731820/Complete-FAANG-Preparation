package com.java.dsa.treeSet;

import java.util.TreeSet;

public class FirstExampleInTreeSet {
	public static void main(String[] args) {
		System.out.println("This is The Example of the Tree Set :");
		TreeSet<String> fruits = new TreeSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pine Apple");
		fruits.add("100");
		fruits.add("200");
		
		System.out.println("The data in the Tree Set is :");
		System.out.println(fruits);
		
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(10);
		numbers.add(30);
		System.out.println("The number is :");
		System.out.println(numbers);
	}

}
