package com.collections.list;

public class ContactRunner2 {

	public static void main(String[] args) {

		ContactManager contactManager = new ContactManager();

		contactManager.addContact(new Contact("Kamal", "8925363812"));
		contactManager.addContact(new Contact("Uday", "9025394089"));
		contactManager.addContact(new Contact("vijay", "9000234567"));

		contactManager.showAllContact();

		contactManager.searchContact("9025394089");

		contactManager.updateContact("Vijay", new Contact("Jeeva", "9988774433"));

		contactManager.deleteContact("Uday");
		contactManager.showAllContact();
	}

}
