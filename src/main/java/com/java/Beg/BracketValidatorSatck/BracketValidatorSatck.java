package com.java.Beg.BracketValidatorSatck;

import java.util.Stack;

public class BracketValidatorSatck {
	
	public static boolean isBracketValidator(String expression) {
		System.out.println("I am calling the Bracket validator Examples ...");
		Stack<Character> stack = new Stack<Character>();
		for(char ch : expression.toCharArray()) {
			System.out.println("the Value of the CH is :="+ch);
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			}else if(ch==')' || ch=='}' || ch==']') {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				System.out.println("the Value of the TOP IS :"+top);
				if(!isMatchingPair(top,ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	private static boolean isMatchingPair(char open, char close) {
		System.out.println("Ismatchingpair Method is calling Okay ...");
		return (open == '(' && close == ')') ||
        (open == '{' && close == '}') ||
        (open == '[' && close == ']');

	}

	public static void main(String[] args) {
		System.out.println("This is the Example of the Bracket validator Example Using Stack");
		
		System.out.println("Small Bracket values : "+isBracketValidator("()"));
		
		/*
		 * System.out.println("Sqaure Bracket With Wrong Bracket okay : "
		 * +isBracketValidator("[)"));
		 * System.out.println("Square Bracket with Coorect Values : "+isBracketValidator
		 * ("[]"));
		 * System.out.println("With Curly Bracket values : "+isBracketValidator("{}"));
		 * System.out.println("With Wrong Bracket is "+isBracketValidator("{]"));
		 */
		
	}

}
