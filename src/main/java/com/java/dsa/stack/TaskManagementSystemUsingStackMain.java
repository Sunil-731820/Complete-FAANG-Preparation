package com.java.dsa.stack;

import java.util.Scanner;

public class TaskManagementSystemUsingStackMain {
	private static DocumentFunctionality docFunctionality = new DocumentFunctionality();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("This is The Example of the Task Management System Using Stack");
		
		int choice;
		do {
			System.out.println("Please Enter 0 to Exist from the Stack ");
			System.out.println("Please Enter 1 to add The Documents in the Stack ");
			System.out.println("Please Enter 2 for update the Document in the Stack ");
			System.out.println("Please Enter 3 for Delete the Document from the Stack");
			System.out.println("Please ENter 4 for Searching the Documents in the Stack ");
			System.out.println("Please Enter 5 for displaying the documents in the Stack");
			System.out.println("Please Enter 6 for Searching the data using AuthorName");
			System.out.println("Please Enter 7 for Searching Any data using Title Or Content Or Author Or Version");
			System.out.println("Enter the CHoice for Performing the Operations on the Stack ");
			choice= scanner.nextInt();
			switch (choice) {
			case 0:
				docFunctionality.existFromTheStackOperation();
				break;
			case 1:
				docFunctionality.addDocumentToStack();
				break;
			case 2 :
				docFunctionality.updateDocumentToStack();
				break;
			case 3:
				docFunctionality.deleteDocumentFromTheStack();
				break;
			case 4: 
				docFunctionality.searchDocumenutInStack();
				break;
			case 5:
				docFunctionality.displayTheDocumentStackData();
				break;
			case 6: 
				docFunctionality.searchtheDocumentusingAuthorName();
					break;
			case 7:
				docFunctionality.searchDataByAnyAttribute();
			default:
				break;
			}
		}while(choice!=0);
	}

}
