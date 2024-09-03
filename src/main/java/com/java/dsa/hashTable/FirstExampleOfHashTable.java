package com.java.dsa.hashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FirstExampleOfHashTable {

	public static void main(String[] args) {
		System.out.println("This is the Example of the Hash Table ");
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(100, "Sunil");
		ht.put(101, "Harish");
		ht.put(102, "Suman");
		ht.put(104, "Subham");
		
		System.out.println("The Size pf The Hash table is :"+ht.size());
		
		for (Entry str : ht.entrySet()) {
			System.out.println("The Key :"+str.getKey() + " and Value is :"+str.getValue());
		}
		
		System.out.println("The Use of The Remove method is :");
		ht.remove(100);
		System.out.println("The SIze Of The HashTable is : "+ht.size());
		
		for (Entry string : ht.entrySet()) {
			System.out.println("The Key After Removal is :"+string.getKey() +"And value is :"+string.getValue());
		}
	}
}
