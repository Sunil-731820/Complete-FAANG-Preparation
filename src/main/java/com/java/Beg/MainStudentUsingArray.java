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
        	System.out.println("Enter 2 for Search Student using Student ID ");
        	System.out.println("Enter 3 for Searcg Student using Student User name :");
        	System.out.println("Enter 4 for Update Student Marks Using Student id Okay");
        	System.out.println("Enter 5 for Delete Student using Student Id Okay");
        	System.out.println("Enter 6 for Sorting the Student Details Using marks");
        	System.out.println("Enter 7 for Calculating the Average of the marks for the Student Data ");
        	choice = sc.nextInt();
        	switch (choice) {
			case 1:
				ops.displayAll();
				break;
			case 2:
				System.out.println("Enter the Student id :");
				int id = sc.nextInt();
				ops.searchByStudentId(id);
				break;
				
			case 3:
				System.out.println("Enter the Student Name to perform Search operations ");
				String studentName = sc.next();
				ops.searchByStudentUsername(studentName);
				break;
			case 4:
				System.out.println("Enter the Student id to update the Student marks ");
				int studentId = sc.nextInt();
				System.out.println("Enter the marks of the Student so that we Can update Marks ");
				double newMarks = sc.nextDouble();
				ops.updateStudentMarksUsingStudentID(studentId, newMarks);
				break;
			case 5:
				System.out.println("Enter the Student id for Deleting the data ");
				int deletedStudentId = sc.nextInt();
				ops.deleteStudentDatausingStudentId(deletedStudentId);
				break;
			case 6:
				System.out.println("Below is the methods of the Sorting The data using Marks :");
				ops.sortStudentDetailsUsingmarks();
				break;
			case 7:
				System.out.println("below is the methods for calculating the Avarage of the Student marks ");
				ops.calculateAverageMarksforStudent();
				break;
			}
        }while (choice!=0);
    }
}
