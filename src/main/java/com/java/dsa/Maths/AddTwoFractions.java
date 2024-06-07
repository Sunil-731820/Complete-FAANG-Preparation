package com.java.dsa.Maths;

import java.util.Scanner;

public class AddTwoFractions {
	
//	Method to find the LCM of The First Denominator and Second Denominator
	
	// Function to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM of two numbers
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
	
//	Methods To add two fractions
	
	public static void addTwoFraction(int firstNumberator, int firstDenominator, int secondNumerator,int secondDenominator) {
		
		if(firstDenominator==0 && secondDenominator==0) {
			throw new IllegalArgumentException("Denominator can not Be Zero");
		}
		
		else {
//			Main Logic Here for adding the two fractions is : 
			lcm(firstDenominator, secondDenominator);
			System.out.println("The LCM Values Of The  two Numbers is ");
			System.out.println(lcm(firstDenominator, secondDenominator));
		}
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is the Example of the adding the two Fractions ");
		Scanner sc = new Scanner(System.in);
		int firstNumerator = sc.nextInt();
		int secondNumerator = sc.nextInt();
		int firstDenominator = sc.nextInt();
		int secondDenominator = sc.nextInt();
		System.out.println("The LCM is the two Number is "+ lcm(firstDenominator, secondDenominator));
		lcm(firstDenominator, secondDenominator);
		
		int resuklt  = firstNumerator*secondDenominator + secondNumerator*firstDenominator;
		System.out.println("The Result is :"+resuklt);
	}

}
