package com.java.dsa.DSA.DataStructure.Array01;

import java.util.Scanner;

public class BasisArrayCreation01 {
	
	public static void basicArrayCreations(int arr[], int size) {
		System.out.println("printing the User Array ELement : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("This is the EXample of the BasisArrayCreation : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The Array by the user");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the ELement In The ARray");
			arr[i] = sc.nextInt();
		}
		basicArrayCreations(arr, size);
	}

}
