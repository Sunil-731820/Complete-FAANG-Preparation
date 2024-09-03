package com.java.dsa.collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstArrayListExample {
	public static void main(String[] args) {
		System.out.println("this is The Example of the Array List in the collections :");
		
//		1 : using class As the Array List 
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("banana");
		list.add("Guava");
		list.add("PineApple");
		
//		iterating the Object using collections : 
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("The Object one by One is :"+itr.next());
		}
		
//		2 : using interface As List 
		System.out.println();
		List<String> listOfvegTable = new ArrayList<>();
		listOfvegTable.add("Cabbage");
		listOfvegTable.add("Cauliflower");
		listOfvegTable.add("carrot");
		
		Iterator itr1 = listOfvegTable.iterator();
		while(itr1.hasNext()) {
			System.out.println("The Vegtables one By one is :"+itr1.next());
		}
	}

}
