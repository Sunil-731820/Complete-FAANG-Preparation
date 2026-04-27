package com.java.Beg.BrowserStack;

public class Main {

	public static void main(String[] args) {
		System.out.println("this is the Example of the Browser history using Stack ..");

		BrowserHistory browser = new BrowserHistory("google.com");
		
		browser.visit("youtube.com");
		browser.visit("github.com");
		browser.visit("stackOverflow.com");
		
		browser.goForward();
		
//		Now Adding one more Visit so that we can have check forward hsitory 
		
		browser.visit("github.com/Sunil-7318");
		browser.goForward();
		
//		Now going one Step Back 
		
		browser.goBack();
		
//		Going One more Step back 
		browser.goBack();
	}
	
}
