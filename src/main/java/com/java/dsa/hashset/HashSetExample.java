package com.java.dsa.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class HashSetExample {

    public static void main(String[] args) {
        // Create a HashSet to store unique student names
        Set<String> studentSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu-driven approach for various operations on HashSet
        do {
            System.out.println("\n====== Student Management System ======");
            System.out.println("1. Add a Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Check if a Student Exists");
            System.out.println("4. Display All Students");
            System.out.println("5. Clear All Students");
            System.out.println("6. Check if Set is Empty");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Add a student to the set
                    System.out.print("Enter student name to add: ");
                    String studentToAdd = scanner.nextLine();
                    if (studentSet.add(studentToAdd)) {
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Student already exists.");
                    }
                    break;

                case 2:
                    // Remove a student from the set
                    System.out.print("Enter student name to remove: ");
                    String studentToRemove = scanner.nextLine();
                    if (studentSet.remove(studentToRemove)) {
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    // Check if a student exists in the set
                    System.out.print("Enter student name to check: ");
                    String studentToCheck = scanner.nextLine();
                    if (studentSet.contains(studentToCheck)) {
                        System.out.println("Student exists in the set.");
                    } else {
                        System.out.println("Student does not exist.");
                    }
                    break;

                case 4:
                    // Display all students
                    System.out.println("All students:");
                    if (studentSet.isEmpty()) {
                        System.out.println("No students to display.");
                    } else {
                        Iterator<String> iterator = studentSet.iterator();
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    }
                    break;

                case 5:
                    // Clear all students from the set
                    studentSet.clear();
                    System.out.println("All students have been cleared.");
                    break;

                case 6:
                    // Check if the set is empty
                    if (studentSet.isEmpty()) {
                        System.out.println("The set is empty.");
                    } else {
                        System.out.println("The set is not empty.");
                    }
                    break;

                case 7:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
