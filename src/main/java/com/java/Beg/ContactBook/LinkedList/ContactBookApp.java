package com.java.Beg.ContactBook.LinkedList;

import java.util.Scanner;

public class ContactBookApp {
	public static void main(String[] args) {
		System.out.println("This is the ContactBookApp using linked List ...");
		Scanner sc = new Scanner(System.in);
		ContactBook book = new ContactBook();
		System.out.println("Enter The Choice First ....");
		int choice;
		do {
			System.out.println("CONTACT BOOK PLEASE CHOOSE ..");
			System.out.println("Enter 1 for displaying All Contact Book Details ..");
			System.out.println("Enter 2 for Add COntact ....");
			System.out.println("Enter 3 for performing the Search using name");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				book.displayContacts();
				break;
			case 2:
				System.out.println("Enter the name ");
				String name = sc.next();
				System.out.println("ENter The phone Number :");
				String phone = sc.next();
				System.out.println("ENter the EMail :");
				String email = sc.next();
				book.addContact(name, phone, email);
				break;
			case 3:
				System.out.println("Enter the name to perform Search using NAME ..");
				String searchname = sc.next();
				book.searchContactUsingName(searchname);
				break;
			default:
				break;
			}
		}while(choice!=0);
	}

}
