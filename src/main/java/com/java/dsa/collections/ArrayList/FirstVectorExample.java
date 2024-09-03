package com.java.dsa.collections.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class FirstVectorExample {
	public static void main(String[] args) {
		System.out.println("This is The Example of the Vector is :=");
		
		List<Integer> numbers = new Vector<>();
		numbers.add(1000);
		numbers.add(2000);
		numbers.add(3000);
		numbers.add(4000);
		
		Iterator<Integer> itr1 = numbers.iterator();
		while(itr1.hasNext()) {
			System.out.println("the Object one By one is : ="+itr1.next());
			
		}
		
//		Using class of The Vector Sections 
		
		Vector<String> listOfvector = new Vector<>();
		listOfvector.add("Hello");
	}

}
