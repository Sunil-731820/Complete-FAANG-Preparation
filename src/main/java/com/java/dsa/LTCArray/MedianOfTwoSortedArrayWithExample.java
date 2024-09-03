package com.java.dsa.LTCArray;

import java.util.Arrays;
import java.util.Scanner;

class ArrayWithExampleData{
		
	public static void getArrayWithTwoSortedData(int firstSize,int secondSize,int[] firstArray,int[] secondArray) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The First Array :");
		firstSize = sc.nextInt();
		System.out.println("Enter the Size of The Second Array is :");
		secondSize = sc.nextInt();
		System.out.println("Started Filling The Data To Both the Array is :");
		for(int i=0;i<firstSize;i++) {
			System.out.println("Pease enter The data for The First Array :");
			firstArray[i] = sc.nextInt();
		}
		
		for(int j=0;j<secondSize;j++) {
			System.out.println("Enter The Size of the Second Array is :");
			secondArray[j] = sc.nextInt();
		}
		
//		Calling the Combined Array After That Will Sort The Data To get the MEdian of The Array
		
		int combinedSize = firstSize+secondSize;
		System.out.println("The total Size of The Array is :="+combinedSize);
		int[] combinedArray = new int[combinedSize];
		for(int i=0;i<firstSize;i++) {
			combinedArray[i] = firstArray[i];
		}
		
		for(int j=firstSize;j<combinedSize-firstSize;j++) {
			combinedArray[j] = secondArray[j];
		}
		System.out.println("The Combined Array  is ");
		for(int k=0;k<combinedSize;k++) {
			System.out.print(combinedArray[k]+ " ");
		}
		
	}
}


// The New Way to get Started With Median of The Two Sorted Array 

class MedianOfTwoSortedArray{
	
	
}

public class MedianOfTwoSortedArrayWithExample {
	public static void main(String[] args) {
		System.out.println("This is The Example of The Median of Two Sorted Array is :");
		int[] arr1 = { 1,2 };
        int[] arr2 = {3, 4};
		
        int[] arr3 = new int[arr1.length + arr2.length];
       
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        
        System.out.println("The third Array data is : =");
        for(int i=0;i<arr3.length;i++) {
        	System.out.print("The Element One By One is : ="+arr3[i]);
        	System.out.println();
        }
        
        System.out.println("After Combined All data Now Sorted The data :=");
        Arrays.sort(arr3);
        System.out.println("After Sorting The Data is : =");
        for(int i=0;i<arr3.length;i++) {
        	System.out.print(arr3[i]+ " ");
        	System.out.println();
        }
        
        int n = arr3.length;
        System.out.println("The Value of The N is : =");
     // If length of array is even
//        if (n % 2 == 0) { 
//            int mid1 = n / 2;
//            int mid2 = mid1 - 1;
//            System.out.println((arr3[mid1] + arr3[mid2]) / 2.0);;
//        } 
//        // If length of array is odd
//        else {
//            System.out.println(arr3[n / 2]);;
//        }
		
//        Lets check for n is Odd 
        if(n%2!=0) {
        	System.out.println("N is Odd okay");
        	double median = (n+1)/2;
        	System.out.println("The Median value is : ="+median);
        }
        else {
        	double part1 = n/2;
        	double part2 = (n/2)+1;
        	double evenMedian = (part1+part2)/2;
        	System.out.println("The Even median is : ="+evenMedian);
        }
        
	}

}
