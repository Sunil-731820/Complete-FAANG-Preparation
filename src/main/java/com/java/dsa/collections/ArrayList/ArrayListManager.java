package com.java.dsa.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListManager {
	
	private static ArrayList<String> list = new ArrayList<>();
	 static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("This is The EXample of performing all operation in ArrayList :");
		
		int choice;
		do {
			showmenu();
			System.out.println("Enter the CHoice here");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 0:
				existfromTheArrayManagerCLass();
				break;
			case 1:
				addElementinTheArrayList();
				break;
			case 2: 
				deleteElementfromTheArray();
				break;
			case 3:
				searchElementInTheArrayList();
				break;
			case 4: 
				updateElementinThegivenArrayList();
				break;
			case 5 :
				sorttheGivenArrayList();
				break;
			case 6:
				displayArrayList();
				break;
			case 7:
				clearArrayList();
				break;
			default:
				break;
			}
			
		}while(choice!=0);
	}
	private static void showmenu() {
		System.out.println("Showing the menu To the User for Selections Operation perform on the ArrayList :");
		System.out.println("Enter 0 for Exist of the Array List Manager Okay");
		System.out.println("Enter 1 for Add Element in the Array List Okay");
		System.out.println("Enter 2 for Remove Element from The Given Array okay");
		System.out.println("Enter 3 for Search Element in the Given Array okay");
		System.out.println("Enter 4 for Update Element in the Given Array Okay");
		System.out.println("Enter 5 for sort the Element in the Given Array okay");
		System.out.println("Enter 6 Display the ELement of the given Array Okay");
		System.out.println("Enter 7 for clearing the element of the Array okay");
		System.out.println("Enter Your CHoice here Please");
		
		
	}

	private static void clearArrayList() {
		System.out.println("Calling the clearArrayList methods :");
		list.clear();
		System.out.println("The ARray List is completely cleared");
	}

	private static void sorttheGivenArrayList() {
		System.out.println("calling the Sort the Given Array List ");
		Collections.sort(list);
		System.out.println("The List is Sorted Successfully okay");
		
	}

	private static void updateElementinThegivenArrayList() {
		System.out.println("calling the updateElementinThegivenArrayList :");
		 System.out.print("Enter the element to update: ");
	        String oldElement = sc.nextLine();
	        if (list.contains(oldElement)) {
	            System.out.print("Enter the new value: ");
	            String newElement = sc.nextLine();
	            int index = list.indexOf(oldElement);
	            list.set(index, newElement);
	            System.out.println("Element updated successfully.");
	        } else {
	            System.out.println("Element not found.");
	        }
		
	}

	private static void searchElementInTheArrayList() {
		System.out.println("calling the searchElementInTheArrayList :");
		System.out.println("Please ENter the Element That Needs to be searched in the Array");
		String searchElement = sc.next();
		System.out.println("user Entered The Search ELement is : ="+searchElement);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==searchElement) {
				System.out.println("Element found Successfully");
				break;
			}
		}
	}

	private static void deleteElementfromTheArray() {
		System.out.println("Calling the deleteElementfromtheArray methods:");
		System.out.println("Please enter the Element that needs to be Deleted from The Array is :");
		String deleteElement = sc.next();
		System.out.println("The user entered deleteElement is :="+deleteElement);
		list.remove(deleteElement);
		System.out.println("Object is Deleted from The Array list Please check :");
		
		
	}

	private static void existfromTheArrayManagerCLass() {
		System.out.println("calling the Existi method to get out of thebArray manager class :");
		if(list.isEmpty()) {
			
		}
		
	}


	
	public static void addElementinTheArrayList() {
		System.out.println("Enter The Element to be Added in the Array list");
		String element = sc.nextLine();
		list.add(element);
		System.out.println("Element is added Successfully");
	}
	
	public static void displayArrayList() {
		System.out.println("callling the DisplayingArrayList element method Start here:");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
