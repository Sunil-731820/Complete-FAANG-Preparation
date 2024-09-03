package com.java.dsa.stack;

import java.util.Stack;

public class StackSearchExample {
    public static void main(String[] args) {
        // Creating a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Searching for an element in the Stack
        int searchElement = 30;
        int position = stack.search(searchElement);

        // Checking the result of the search
        if (position != -1) {
            System.out.println("Element " + searchElement + " found at position: " + position + " from the top");
        } else {
            System.out.println("Element " + searchElement + " not found in the stack.");
        }

        // Trying to search for an element not present in the stack
        int searchElementNotFound = 100;
        int positionNotFound = stack.search(searchElementNotFound);

        if (positionNotFound != -1) {
            System.out.println("Element " + searchElementNotFound + " found at position: " + positionNotFound + " from the top");
        } else {
            System.out.println("Element " + searchElementNotFound + " not found in the stack.");
        }
    }
}
