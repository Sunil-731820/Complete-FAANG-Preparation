package com.java.dsa.OOPS;

import java.util.Scanner;

class Addition{
	int sum = 0;
	
	public int sumofTwoNumber(int  number1, int numb2) {
		sum = numb2 + number1;
		return sum;
	}
}

public class MultiplemethodsDeclarations {
	public static void main(String[] args) {
		System.out.println("This is The EXample of the Method Dclarations using various metods : =");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter The Second number :");
		int secondNum = sc.nextInt();
		Addition a1 = new Addition();
		int res = a1.sumofTwoNumber(firstNum, secondNum);
		System.out.println("The Result for addiing two Number is :"+res);
	}

}
