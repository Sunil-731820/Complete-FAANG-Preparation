package com.java.dsa.DSA.DataStructure.Array01;

import java.util.Scanner;

public class MergeArrayExample1 {
	public static void main(String[] args) {
		System.out.println("This is the EXample of the MergeArrayExample1 : ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The First Array");
		int sizeOfTheFirstArray = sc.nextInt();
		int[] firstArray = new int[sizeOfTheFirstArray];
		for(int i =0;i<sizeOfTheFirstArray;i++) {
			System.out.println("Enter The Element In The Second Array");
			firstArray[i] = sc.nextInt();
		}
		System.out.println("Displaying the First Array is ");
		for(int i=0;i<sizeOfTheFirstArray;i++) {
			System.out.print(firstArray[i]+ " ");
		}
		
		System.out.println("Enter The Size of The Second Array ");
		int sizeOfSecondARray =  sc.nextInt();
		int[] secondArray = new int[sizeOfSecondARray];
		for(int j=0;j<sizeOfSecondARray;j++) {
			System.out.println("Enter the Element In Te Second Array ");
			secondArray[j] = sc.nextInt();
		}
		System.out.println("Displaying The Element In The Second Array ");
		for(int i=0;i<sizeOfSecondARray;i++) {
			System.out.print(secondArray[i]+ " ");
		}
		
		
	}

}
