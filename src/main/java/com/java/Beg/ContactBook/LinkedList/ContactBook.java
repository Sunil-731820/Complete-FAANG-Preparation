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


}
