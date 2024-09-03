package com.java.dsa.ArrayListProjects;

import java.util.Scanner;

public class MainCMS {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		CMS cms = new CMS(); 
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			cms.showMenu();
			System.out.println("Please Enter The CHoice From The Above Information");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				cms.existingFromTheArrayListCMS();
				break;
			case 1:
				cms.addElementTotheArrayListInCMS();
				break;
			case 2:
				cms.updateElementToArrayListInCMS();
				break;
			case 3:
				cms.deleteElementFromTheArrayListInCMS();
				break;
			case 4:
				cms.searchElementInTheArrayListInCMS();
				break;
			case 5:
				cms.sortElementInTheArrayListInCMS();
				break;
			case 6:
				cms.displayingTheArticleInCMS();
				break;
			case 7:
				cms.filteringTheArticleInCMS();
				break;
			case 8:
				cms.searchByAnyAttributeLiketitleOrContentOrAuthorOrversion();
				break;
			default:
				break;
			}
				
		}while(choice!=0);
	}


	

}
