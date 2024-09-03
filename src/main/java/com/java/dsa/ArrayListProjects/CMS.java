package com.java.dsa.ArrayListProjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CMS {

	Article  article = new Article();
	private static ArrayList<Article> listOfArticle = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
//	This is the first method to Show the menu to the user on the console 
	public static void showMenu() {
		System.out.println("calling the Show menu for This Article pages :");
		System.out.println("Please Enter 0 for the Existing the Article Section");
		System.out.println("Please Enter 1 for the Adding Articles to the Article Section");
		System.out.println("Please Enter 2 for Updating the Article to the Article Section");
		System.out.println("Plesse Enter 3 for Deleting the Article from The Article Section");
		System.out.println("Please Enter 4 for Searching the Article in the Article Section");
		System.out.println("Please Enter 5 for the Sorting the Article On the Basis of the title or version Or Author");
		System.out.println("Please Enter 6 for Displaying the Article");
		System.out.println("Please Enter 7 for filtering the Article On the Basis of the Author , Versionn and Title");
		System.out.println("Please Enter 8 for searchByAnyAttributeLiketitleOrContentOrAuthorOrversion ");
	}
	
	 static void filteringTheArticleInCMS() {
		 System.out.println("Filter by: 1. Author  2. Version Range");
	        int choice = scanner.nextInt();
	        scanner.nextLine();

	        switch (choice) {
	            case 1 : {
	                System.out.print("Enter author name: ");
	                String author = scanner.nextLine();
	                listOfArticle.stream().filter(a -> a.getAuthor().equalsIgnoreCase(author)).forEach(System.out::println);
	            }
	            case 2 : {
	                System.out.print("Enter min version: ");
	                int minVersion = scanner.nextInt();
	                System.out.print("Enter max version: ");
	                int maxVersion = scanner.nextInt();
	                listOfArticle.stream().filter(a -> a.getVersion() >= minVersion && a.getVersion() <= maxVersion)
	                        .forEach(System.out::println);
	            }
	            default : System.out.println("Invalid choice.");
	        }
	}


	 static void displayingTheArticleInCMS() {
		System.out.println("calling the Display Method for CMS :");
		if(listOfArticle.isEmpty()) {
			System.out.println("No Article Found because the List of Article is Empty ");
		}else {
			Iterator<Article> itr = listOfArticle.iterator();
			while(itr.hasNext()) {
				System.out.println("The Element from the List of The Article is "+itr.next());
			}
		}
		
	}


	 static void sortElementInTheArrayListInCMS() {
		System.out.println("Calling the Sort Method for CMS :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CHoice for Sorting The Data by 1: for Title ,2 : for Author or 3 : for Version");
		int choiceOfSorting = sc.nextInt();
		switch (choiceOfSorting) {
		case 1:
			System.out.println("Before Calling the Sorting method on the BAsis of the getTitle Attributes ");
			listOfArticle.sort(Comparator.comparing(Article::getTitle));
			break;
		case 2:
			System.out.println("Before Calling the Sorting method on the BAsis of the getAuthor Attributes ");
			listOfArticle.sort(Comparator.comparing(Article::getAuthor));
			break;
		case 3:
			System.out.println("Before Calling the Sorting method on the BAsis of the getVersion Attributes ");
			listOfArticle.sort(Comparator.comparing(Article::getVersion));

		default:
			System.out.println("Invalid choice please check again :");
			break;
		}
		System.out.println("Article is Sorted Successfully :");
		System.out.println("After Sorting the List of The Article is ");
		displayingTheArticleInCMS();
		
		
	}


	 static void searchElementInTheArrayListInCMS() {
		System.out.println("Calling the Search method for CMS :");
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		System.out.println("The user Enter Title is : ="+title);
		Article singleArticleByTitile = findArticleByTitle(title);
		System.out.println("the Article By title is :"+singleArticleByTitile);
		System.out.println("The title is :"+singleArticleByTitile.getTitle());
		System.out.println("The Author is :"+singleArticleByTitile.getAuthor());
		System.out.println("the version is :"+singleArticleByTitile.getVersion());
		System.out.println("The date is :"+singleArticleByTitile.getCreatedDate());
		
	}


	 static void deleteElementFromTheArrayListInCMS() {
		System.out.println("Calling the delete Method for CMS :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Element That you want to delete ");
		String title = sc.nextLine();
		Article findingTheArticlebyTitle = findArticleByTitle(title);
		if(findingTheArticlebyTitle!=null) {
			listOfArticle.remove(findingTheArticlebyTitle);
		}else {
			System.out.println("No Article Is Found from the List of The Article :");
		}
		
	}


	 static void updateElementToArrayListInCMS() {
		System.out.println("calling the Update method for CMS :");
		if(listOfArticle.isEmpty()) {
			System.out.println("No record found so that need to be updated ");
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Title That you want to update okay ");
			String title = sc.nextLine();
			System.out.println("User Entered the title value is :"+title);
			Article article = findArticleByTitle(title);
			if(article!=null) {
				System.out.println("Enter the New Content That need to be Updated :");
				String content = sc.nextLine();
				System.out.println("Enter the New Author Name that need to be Updated :");
				String author = sc.nextLine();
				System.out.println("Enter the New Version that Need to be Updated :");
				int version = sc.nextInt();
				article.setContent(content);
				article.setAuthor(author);
				article.setVersion(version);
			}else {
				System.out.println("No record found ");
			}
			
		}
		
	}


	 static void addElementTotheArrayListInCMS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("calling the add Method for CMS :");
		System.out.println("Enter the title for the CMS :");
		String title = sc.nextLine();
		System.out.println("Enter the content for the CMS ");
		String content = sc.nextLine();
		System.out.println("Enter the Author for the CMS ");
		String author = sc.nextLine();
		System.out.println();
		System.out.println("Enter the version of the CMS ");
		int version = sc.nextInt();
		listOfArticle.add(new Article(title, content, author, version));
		System.out.println("The Article is Added Successfully ");
		
		
	}


	static void existingFromTheArrayListCMS() {
		System.out.println("calling the existing method for CMS :");
		
	}
	
	static Article findArticleByTitle(String title) {
		System.out.println("calling the findArticleByTitle method Started here ");
		return listOfArticle.stream().filter(artcle -> artcle.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
	}

	public void searchByAnyAttributeLiketitleOrContentOrAuthorOrversion() {
		System.out.println("calling the searchAttributeLiketitleOrContentOrAuthorOrversion :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Title Or Content or Author Or version for Searchinng in the List ");
		String StringvaluetakenByuser = sc.nextLine();
		
		List<Article> listOfArticleAfterSearching = listOfArticle.stream().
				filter(a -> a.getTitle().contains(StringvaluetakenByuser) || 
						a.getAuthor().contains(StringvaluetakenByuser) ||
						a.getContent().contains(StringvaluetakenByuser))
				.collect(Collectors.toList());
		
		if(listOfArticleAfterSearching!=null) {
			listOfArticleAfterSearching.forEach(System.out::println);
		}else {
			System.out.println("No Record found for that Specific search okay :");
		}
		
	}
	
}
