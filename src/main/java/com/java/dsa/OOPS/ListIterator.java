package com.java.dsa.OOPS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListIterator {
	public static void main(String[] args) {
		System.out.println("This is the Example of loist");
		
		List<Integer> listOfObject = new ArrayList<>();
		listOfObject.add(100);
		listOfObject.add(10);
		listOfObject.add(200);
		listOfObject.add(1);
		System.out.println("The Size of The List is : ="+listOfObject.size());
		
		for(int i=0;i<listOfObject.size();i++) {
			System.out.println("Object one by one is :="+listOfObject.get(i));
		}
		Collections.sort(listOfObject);
		System.out.println("the Size of the List is : ="+listOfObject.size());
		for(int i=0;i<listOfObject.size();i++) {
			System.out.println("Object one by one is :="+listOfObject.get(i));
		}
	}

}
