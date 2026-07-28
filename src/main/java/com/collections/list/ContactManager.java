package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactManager {

	List<Contact> contacts;

	public ContactManager() {

		contacts = new ArrayList<Contact>();
	}

	public void addContact(Contact contactToAdd) {

		if (contacts.add(contactToAdd)) {

			System.out.println("Contact added successfully!!");
		} else {
			System.err.println("Something went wrong!!!");
		}
	}

	public void showAllContact() {

		for (Contact contact : contacts) {

			System.out.println(contact.getName() + "\t" + contact.getContactNumber());

		}

	}

	public void searchContact(String nameOrContactNumber) {

		int contactSearchIndex = -1;

		for (int index = 0; index < contacts.size(); index++) {

			if (contacts.get(index).getName().equalsIgnoreCase(nameOrContactNumber)
					|| contacts.get(index).getContactNumber().equalsIgnoreCase(nameOrContactNumber)) {

				contactSearchIndex = index;
				break;
			}

		}

		if (contactSearchIndex == -1) {
			System.err.println("Contact not found!!");
		} else {
			System.out.println(contacts.get(contactSearchIndex));
		}

	}

	public void updateContact(String nameOrContactNumber, Contact updatedContact) {

		int contactUpdateIndex = -1;

		for (int index = 0; index < contacts.size(); index++) {

			if (contacts.get(index).getName().equalsIgnoreCase(nameOrContactNumber)
					|| contacts.get(index).getContactNumber().equalsIgnoreCase(nameOrContactNumber)) {

				contactUpdateIndex = index;
				break;
			}

		}

		if (contactUpdateIndex == -1) {
			System.err.println("Contact not found!!");
		} else {
			contacts.set(contactUpdateIndex, updatedContact);

			System.out.println("Contact Updated Successfully!!");
		}

	}
	
	public void deleteContact(String nameOrContactNumber) {
		
		int contactToDeleteIndex = -1;
		
		for (int index = 0; index < contacts.size(); index++) {
			
			if (contacts.get(index).getName().equalsIgnoreCase(nameOrContactNumber)
					|| contacts.get(index).getContactNumber().equalsIgnoreCase(nameOrContactNumber)) {
				
				contactToDeleteIndex = index;
				break;
			}
			
		}
		
		if (contactToDeleteIndex == -1) {
			System.err.println("Contact not found!!");
		} else {
			contacts.remove(contactToDeleteIndex);
			
			System.out.println("Contact Deleted Successfully!!");
		}
		
	}

}
