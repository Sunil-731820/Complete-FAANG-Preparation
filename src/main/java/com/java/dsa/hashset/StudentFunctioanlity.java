package com.java.dsa.hashset;

import java.awt.Choice;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentFunctioanlity {
	
	private static Set<Student> setOfStudent = new HashSet<>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("Calling the Show menu Methods ");
		
		int choice = 0;
		do {
			System.out.println("Enter 1 for Adding the Students ");
			System.out.println("Enter 2 for Removing the Students ");
			System.out.println("Enter 3 to check Student Exist or Not");
			System.out.println("Enter 4 to Display all Students ");
			System.out.println("Enter 5 to Clear All Students ");
			System.out.println("Enter 6 to check wheather set is Empty or Not ");
			System.out.println("Enter 7 to Exist from The Set ");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Please Enter the Choice from the Above one ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("calling Add methods okay ");
				addStudentData();
				break;
			case 2:
				removeStudentData();
				break;
			case 3:
				checkStudentExistOrNot();
				break;
			case 4:
				displayStudentData();
				break;
			case 5:
				clearAllStudentData();
				break;
			case 6:
				checkWeatherSetIsEmptyOrNot();
				break;
			case 7:
				existFromStudentData();
				break;
			default:
				break;
			}

		}while(choice!=0);
		
		
		
	}

	private static void existFromStudentData() {
		System.out.println("Out of The Exit Student Data Okay :");
	}

	private static void checkWeatherSetIsEmptyOrNot() {
		System.out.println("Calling the check WeatherSet is Empty Or not :");
		if(setOfStudent.isEmpty()) {
			System.out.println("Set of The Student is Empty Okay");
		}else {
			System.out.println("The Set of The Student is not Empty Okay ");
		}
	}

	private static void clearAllStudentData() {
		System.out.println("Calling the clear All Student Data from The Set ");
		setOfStudent.clear();
		
	}

	private static void displayStudentData() {
		System.out.println("Displaying the data of the STudent is ");
		Iterator itr = setOfStudent.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void checkStudentExistOrNot() {
		System.out.println("calling the exist from the STudent Data ");
		System.out.println("Enter The Student Id to Check weather Student Exist or Not ");
		int studentId = sc.nextInt();
		if(setOfStudent.contains(studentId)) {
			System.out.println("STudent Found");
		}else {
			System.out.println("no Student Found With This Id ");
		}
	}

	private static void removeStudentData() {
		System.out.println("Calling the remove Student Data ");
		System.out.println("Enter the Student id ");
		int studentId = sc.nextInt();
		setOfStudent.remove(studentId);
		System.out.println("Student Remove Successfully ");
	}

	private static void addStudentData() {
		System.out.println("Calling the Add method to Add the data to Student ");
		System.out.println("Enter The Id of the Student ");
		int id = sc.nextInt();
		System.out.println("Enter The name of the Student ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter The Age ");
		int age = sc.nextInt();
		System.out.println("Enter the Salary ");
		int salary = sc.nextInt();
		setOfStudent.add(new Student(id, name, id, salary));
		System.out.println("Student Added Successfully Okay ");
	}

}
