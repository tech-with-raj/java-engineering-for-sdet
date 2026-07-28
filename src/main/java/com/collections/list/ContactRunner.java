package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ContactRunner {

	public static void main(String[] args) {

		Contact contact1 = new Contact("Rajasekar", "9025394089");

//		System.out.println(contact1);

		Contact contact2 = new Contact("Sandy", "9025394099");

//		System.out.println(contact2);

		List<Contact> contacts = new ArrayList<Contact>();

		contacts.add(contact1);
		contacts.add(contact2);
		contacts.add(new Contact("Malar", "9025394089"));

		contacts.forEach(System.out::println);
		System.out.println("***************************************");

		// Update contact
		int contactIndex = -1;

		for (int index = 0; index < contacts.size(); index++) {

			Contact contact = contacts.get(index);

			if (contact.getName().equalsIgnoreCase("Rajasekar")) {

				contactIndex = index;
				break;

			}

		}

		System.out.println("Contact found at index " + contactIndex);

		if (contactIndex != -1) {

			contacts.set(contactIndex, new Contact("Raj", "9442833080"));
		}

		contacts.forEach(System.out::println);

		System.out.println("***************************************");
		// Delete contact

		int contactIndexToDelete = -1;

		for (int index = 0; index < contacts.size(); index++) {

			Contact contactToRemove = contacts.get(index);

			if (contactToRemove.getName().equalsIgnoreCase("Raj")) {

				contactIndexToDelete = index;
				break;
			}

		}

		if (contactIndexToDelete != -1) {

			contacts.remove(contactIndexToDelete);

		}

		contacts.forEach(System.out::println);

	}

}
