package com.java.dsa.collections.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FirstLinkedListExample {
	public static void main(String[] args) {
		System.out.println("This is The EXample of The LinkedList is :");
		
//		1 : using List Interface to use LinkedList Class okay 
		
		List<String> firstList = new LinkedList<>();
		firstList.add("Hello");
		firstList.add("HI");
		firstList.add("Bye");
		firstList.add("Namste");
		
//		Iterating the first list ovet the Linked List is 
		
		Iterator itr = firstList.iterator();
		while(itr.hasNext()) {
			System.out.println("The value One By One is : ="+itr.next());
		}
		
//		2 : using the LinkedList as the class okay 
		
		LinkedList<Integer> number = new LinkedList<>();
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(400);
		
//		Iterating the Numbers is 
		Iterator itr1 = number.iterator();
		while(itr1.hasNext()) {
			System.out.println("The Number one By one is : ="+itr1.next());
		}
	}

}
