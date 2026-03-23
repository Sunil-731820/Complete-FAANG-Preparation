package com.java.Beg;

import java.util.Scanner;

public class MainStudentUsingArray {
    public static void main(String[] args) {
    	
    	StudentOperations ops = new StudentOperations(10); // Capacity is 10 for now will change after some time 
    	Scanner sc = new Scanner(System.in);
    	
//    	Adding some of the initial Data to Student Array
    	ops.addStudent(new Student(101, "Alice", 20, 88.5));
        ops.addStudent(new Student(102, "Bob", 21, 76.0));
        ops.addStudent(new Student(103, "Charlie", 19, 92.3));
        ops.addStudent(new Student(104, "David", 22, 67.8));
        ops.addStudent(new Student(105, "Eva", 20, 81.4));
        System.out.println("the Size of the Student records Are :"+ops.count);
        
        int choice;
        do {
        	System.out.println("========== below is the menu for performing Operations on Student Data====");
        	System.out.println("Enter 1 for Displaying all Students records one by one .");
        	choice = sc.nextInt();
        	switch (choice) {
			case 1:
				ops.displayAll();
				break;
			case 2:
				System.out.println("Enter the Student id :");
				int id = sc.nextInt();
				ops.searchByStudentId(id);
			}
        }while (choice!=0);
    }
}
