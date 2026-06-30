package com.file.handling;

import java.io.Serializable;

public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String contactNumber;
	private transient String emergencyContact;

	public Contact(String name, String contactNumber, String emergencyContact) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.emergencyContact = emergencyContact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + ", emergencyContact=" + emergencyContact
				+ "]";
	}

}
