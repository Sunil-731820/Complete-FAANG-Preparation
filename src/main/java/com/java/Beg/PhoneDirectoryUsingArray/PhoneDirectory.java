package com.java.Beg.PhoneDirectoryUsingArray;

public class PhoneDirectory {
	
	private Contact[] contacts;
	private int count;
	
	public PhoneDirectory(int size) {
		contacts =  new Contact[10];
		count = 0;
	}
	
//	Add Phone Number to Directory
	
	public void addPhoneNumber(String name, String phoneNumber) {
		if(count == contacts.length) {
			System.out.println("Phone Directory is Full ...");
		}else {
			contacts[count++] = new Contact(name, phoneNumber);
		}
	}
	
//	Display All Phone Contact Details 
	
	public void displayAllPhoneNumber() {
		
	}

}

