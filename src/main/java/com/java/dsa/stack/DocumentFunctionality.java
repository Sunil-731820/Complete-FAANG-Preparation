package com.java.dsa.stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class DocumentFunctionality {
	
	private static Stack<Document> documentStack = new Stack<>();
	private static Scanner scanner = new Scanner(System.in);

	public void existFromTheStackOperation() {
		System.out.println("getting Out of the do while loop and Exist okay");
	}

	public void addDocumentToStack() {
		System.out.println("Calling the add Document to the Stack ");
		System.out.println("Please Enter the title to add the data to the Stack okay");
		String title = scanner.nextLine();
		System.out.println("Please Enter the Content so that it can be added okay");
		String content = scanner.nextLine();
		System.out.println("Please Enter The Author so that it can be added okay");
		String author = scanner.nextLine();
		System.out.println("Please Enter the version so that it can be added okay");
		int version = scanner.nextInt();
		scanner.nextLine();
		documentStack.push(new Document(title, content, author, version));
		System.out.println("User Successfully Added the Documents okay");
		
	}

	public void updateDocumentToStack() {
		System.out.println("calling the updateDocument method to Stack");
		if(documentStack.isEmpty()) {
			System.out.println("The Stack is Completely Blank");
		}else {
			System.out.println("Enter the Title first for checking weather data is there or not in Stack");
			String title = scanner.nextLine();
			Document document = findDocumentBytitle(title);
			if(document!=null) {
				System.out.println("Please Enter the New Title So that It can be Updated okay");
				String newTitle = scanner.nextLine();
				System.out.println("Please Enter new COntent So that It can be Updated okay ");
				String newContent = scanner.nextLine();
				System.out.println("Please Enter the NEw Author So that it can be Updated okay");
				String newAuthor = scanner.nextLine();
				System.out.println("Please ENter The New Version so that it can be updated okay ");
				int newversion = scanner.nextInt();
				document.setTitle(newTitle);
				document.setContent(newContent);
				document.setAuthor(newAuthor);
				document.setVersion(newversion);
			}else {
				System.out.println("No Documents found ");
			}
			
			
		}
		
	
		
	}

	public void deleteDocumentFromTheStack() {
		System.out.println("Calling the Delete Document from the Stack methods okay");
		if(documentStack.isEmpty()) {
			System.out.println("No record found So That it can be deleted okay");
		}else {
			System.out.println("please Enter the title so that it can be deleted okay");
			String title = scanner.nextLine();
			System.out.println("The title is :"+title);
			documentStack.pop();
		}
		
		
	}

	public void searchDocumenutInStack() {
		System.out.println("calling the search Document in Stack method :");
		System.out.println("Please Enter the title so  that needs to be Searched ");
		String title = scanner.nextLine();
		System.out.println("The title is :"+title);
		boolean found = false;
		for(Document doc : documentStack) {
			if(doc.getTitle().equalsIgnoreCase(title)) {
				System.out.println("title Found in the Given Stack okay :"+title);
				System.out.println("The Title is :"+doc.getTitle());
				System.out.println("The Content is :"+doc.getContent());
				System.out.println("The Author is :"+doc.getAuthor());
				System.out.println("The Version is :"+doc.getVersion());
				found = true;
			}
		}
		if(!found) {
			System.out.println("No ELement for The User ENtered title Okay :");
		}
		
		
	}

	public void displayTheDocumentStackData() {
		System.out.println("calling the Display the Stack data");
		Iterator itr = documentStack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	public void searchtheDocumentusingAuthorName() {
		System.out.println("calling the Search Document using Author Name");
		System.out.println("Enter The Author Name so that I can Search");
		String authorName = scanner.nextLine();
		System.out.println("The Author Name is :"+authorName);
		boolean found = false;
		for(Document doc : documentStack) {
			if(doc.getAuthor().equalsIgnoreCase(authorName)) {
				System.out.println("The Author Data is Found And Below is the Details for it");
				System.out.println("the Title of The Author is :"+doc.getTitle());
				System.out.println("The Content of the Author is :"+doc.getContent());
				System.out.println("The Author name is :"+doc.getAuthor());
				System.out.println("The version of the Author is :"+doc.getVersion());
				found = true;
			}
		}
		if(!found) {
			System.out.println("No Element Found for the this Name ");
		}
		
		
	}
	
	static Document findDocumentBytitle(String title) {
		System.out.println("Calling the find Document By Title name ");
		return documentStack.stream().filter(tit -> tit.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
		
		
	}

	public void searchDataByAnyAttribute() {
		System.out.println("calling the searchDataByAnyAttribute Method here Okay");
		System.out.println("Please ENter The Data Like title or Content Or Author Name So That Search can be done");
		String userEnteredData = scanner.nextLine();
		System.out.println("The User Enter Data is :"+userEnteredData);
		Stack<Document> stackofDocument =  documentStack.stream().
				filter(a->a.getTitle().equalsIgnoreCase(userEnteredData) || 
						a.getContent().equalsIgnoreCase(userEnteredData)|| 
						a.getAuthor().equalsIgnoreCase(userEnteredData)).collect(Collectors.toCollection(Stack::new));
		if(stackofDocument!=null) {
			System.out.println("The title of the Stack is :");
			stackofDocument.forEach(System.out::println);
		}else {
			System.out.println("The Stack is Empty okay ");
		}
	}
	

}
