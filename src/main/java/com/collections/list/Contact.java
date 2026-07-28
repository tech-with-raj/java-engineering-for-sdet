package com.collections.list;

public class Contact {

	private String name;
	private String contactNumber;

	public Contact(String name, String contactNumber) {

		if (validateName(name) && validateContactNumber(contactNumber))
		this.name = name;
		this.contactNumber = contactNumber;
	}

	private boolean validateContactNumber(String contactNumber) {

		if (contactNumber == null || contactNumber.isEmpty() || !contactNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Contact number can't be null or empty and should be 10 digit!!");
		} else {
			return true;
		}

	}

	private boolean validateName(String name) {

		if (name == null || name.isEmpty()) {

			throw new IllegalArgumentException("Name can't be null or empty");
		} else {
			return true;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(validateName(name))
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if(validateContactNumber(contactNumber))
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + "]";
	}

}
