package com.java.dsa.DSA.DataStructure.Array01;

import java.util.Scanner;

public class FindDuplicateInArray {
	
	
	static void printDuplicateValueInArray(int size, int[] arr,int repeatElement) {
		System.out.println("The Repeating Elements In The Array is ");
		for(int i=0;i<size;i++) {
			if(repeatElement==arr[i]) {
				System.out.println("The Repeating Element in The Given Array is "+repeatElement);
				break;
			}
			else {
				System.out.println("NO REPEATING ELEMENT FOund in Array");
				break;
			}
		}
	}
	
	  
	public static void main(String[] args) {
		System.out.println("This is the EXample of finding Duplicate Element In The Array ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Array ");
			array[i] = sc.nextInt();
		}
		System.out.println("Enter The Repeating element is ");
		int repeatingElement = sc.nextInt();
		printDuplicateValueInArray(size, array,repeatingElement);
		
	}

}
