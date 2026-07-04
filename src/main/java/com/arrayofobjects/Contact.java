package com.arrayofobjects;

public class Contact {

	private String name;
	private String contactNumber;

	public Contact(String name, String contactNumber) {
		super();
		if (validateName(name) && validateContactNumber(contactNumber))
			this.name = name;
		    this.contactNumber = contactNumber;
	}

	private boolean validateName(String name) {

		if (name.matches("[a-zA-Z\\s]+")) {
			return true;
		} else if (name == null || name.trim().isEmpty()) {

			throw new IllegalArgumentException("Name cannot be null or empty");
		} else {
			throw new IllegalArgumentException("Name can only have alphabets!!");
		}
	}

	private boolean validateContactNumber(String contactNumber) {

		if (contactNumber.matches("\\d+") && contactNumber.length() == 10) {

			return true;

		} else if (contactNumber == null || contactNumber.trim().isEmpty()) {

			throw new IllegalArgumentException("Contact number cannot be null or empty");
		} else {
			throw new IllegalArgumentException("Contact number can only have 10 digit!!");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (validateName(name))
			this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber))
			this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + "]";
	}

}
