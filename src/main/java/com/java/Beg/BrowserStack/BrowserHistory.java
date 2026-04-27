package com.java.Beg.BrowserStack;

import java.util.Stack;

public class BrowserHistory {
	
	private Stack<String> backStack =  new Stack<String>();
	private Stack<String> forwardStack = new Stack<String>();
	
	private String currentPage;
	
	
	public BrowserHistory(String homePage) {
		currentPage = homePage;
		System.out.println("The Openned page is : "+currentPage);
	}
	
	
//	Visited a new page 
	
	public void visit(String url) {
		backStack.push(currentPage);
		currentPage = url;
		forwardStack.clear();
		System.out.println("VISITED PAGE : "+currentPage);
	}
	
	
//	Go back page
	public void goBack() {
		if(!backStack.isEmpty()) {
			forwardStack.push(currentPage);
			currentPage = backStack.pop();
			System.out.println("BACK TO :"+currentPage);
		}else {
			System.out.println("NO BROWSER HISTORY OKAY ...");
		}
	}
	
//	Go forward methods 
	
	public void goForward() {
		if(!forwardStack.isEmpty()) {
			backStack.push(currentPage);
			currentPage = forwardStack.pop();
			System.out.println("FORWARD TO .. "+currentPage);
		}else {
			System.out.println("NO FORWARD HISTORY ..");
		}
	}
	
//	Current page is
	public String getCurrentPage() {
		System.out.println("get Current Page is :");
		return currentPage;
	}
	

}
