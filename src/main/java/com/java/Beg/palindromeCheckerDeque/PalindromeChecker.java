package com.java.Beg.palindromeCheckerDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeChecker {

	
	public static boolean isPalindromeChecker(String expression) {
		Deque<Character> dequeu = new ArrayDeque<Character>();
		
//		First Add Character to the Dequeu 
		for(char ch : expression.toCharArray()) {
			dequeu.addLast(ch);
		}
		
//		Now After adding Now Compare front with last values okay ...
		
		while(dequeu.size()>1) {
			char frontCharacter = dequeu.removeFirst();
			char lastCharacter = dequeu.removeLast();
			System.out.println("Front Character is : "+frontCharacter);
			System.out.println("Last Character is :"+lastCharacter);
			
			if(frontCharacter !=lastCharacter) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("This is the Example of the palindrome checker using DEqueu DS");
		
		System.out.println(isPalindromeChecker("madam1"));
	}
}
