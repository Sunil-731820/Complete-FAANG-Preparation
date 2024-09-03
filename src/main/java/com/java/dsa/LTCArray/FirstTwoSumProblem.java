package com.java.dsa.LTCArray;

import java.util.Scanner;

class TwoSumProblem {

	public int[] getSolutionOfTwoSum(int size, int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[i] + nums[j] == target) {
	            	System.out.println("The value of The Pair Object is : ="+i+ " "+ j);
	            	System.out.println("The number At That position : ="+nums[i]+ "  "+nums[j]);         	 
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}

public class FirstTwoSumProblem {
	public static void main(String[] args) {
		System.out.println("This is The Example of the First Two Sum problems :=");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size of The Array : =");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter The Element One By One pls : =");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array of the Element is : =");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Enter The target Element is : =");
		int target = sc.nextInt();
		TwoSumProblem sumofTwoNumber = new TwoSumProblem();
		sumofTwoNumber.getSolutionOfTwoSum(size, arr, target);

	}

}
