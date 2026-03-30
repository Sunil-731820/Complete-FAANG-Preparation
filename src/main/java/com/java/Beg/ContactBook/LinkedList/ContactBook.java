package com.java.Beg.ContactBook.LinkedList;

public class ContactBook {
	

	private Contact head;
	
	
// Add contact
public void addContact(String name, String phone, String email) {
    Contact newContact = new Contact(name, phone, email);

    if (head == null) {
        head = newContact;
    } else {
        Contact temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newContact;
    }
    System.out.println("✅ Contact added successfully!");
}

	
//	2 : Display all contact using linked List 
	

// Display all contacts
    public void displayContacts() {
        if (head == null) {
            System.out.println("📭 No contacts found.");
            return;
        }

        Contact temp = head;
        while (temp != null) {
            System.out.println("---------------------");
            System.out.println("Name : " + temp.name);
            System.out.println("Phone: " + temp.phone);
            System.out.println("Email: " + temp.email);
            temp = temp.next;
        }
    }
    
//    3 : Search COntact using Name :
    public void searchContactUsingName(String name) {
    	Contact temp = head;
    	while(temp!=null) {
    		if(name.equalsIgnoreCase(temp.name)) {
    			System.out.println("DETAILS ARE ...");
    			System.out.println("the name of the contact is :"+temp.name);
    			System.out.println("the phone number of the contact is :"+temp.phone);
    			System.out.println("the email of the contact is :"+temp.email);
    			return;
    		}
    		temp = temp.next;
    	}
    	System.out.println("No Data Are found with Given Name ...");
    }


}
