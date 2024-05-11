package com.java.dsa.DSA.DataStructure.Array01;

import java.util.Scanner;

public class ReverseTheArray {
	
	public static void create_Array(int[] arr , int size) {
		System.out.println("The Given Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("AFter reversing the Array : =");
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j]+ " ");
		}
 	}
	
	public static void main(String[] args) {
		System.out.println("This is the Example of the Reevsre the Array using java programming Language :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Agiven Array");
			array[i] = sc.nextInt();
		}
		create_Array(array, size);
		
	}

}
