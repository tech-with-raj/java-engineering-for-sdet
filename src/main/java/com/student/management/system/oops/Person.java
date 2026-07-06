package com.student.management.system.oops;

import java.io.Serializable;

import com.student.management.system.exceptions.InvalidAddressException;
import com.student.management.system.exceptions.InvalidAgeException;
import com.student.management.system.exceptions.InvalidContactNumberException;

public abstract class Person implements Serializable{

	
	private static final long serialVersionUID = 1L;
	protected String name;
	protected int age;
	protected String contactNumber;
	protected String address;
	private static int personCount = 0;

	public Person(String name, int age, String contactNumber, String address) {

		if (validateAge(age) && validateAddress(address) && validateContactNumber(contactNumber)) {
			this.name = name;
			this.age = age;
			this.contactNumber = contactNumber;
			this.address = address;
			personCount++;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber))
			this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address))
			this.address = address;
	}
	
	private boolean validateAge(int age) {
		if(age >= 18 && age <= 23) {
			return true;
		}else {
			throw new InvalidAgeException("Age should be within 18 to 23");
		}
	}

	public boolean validateContactNumber(String contactNumber) {

		if (contactNumber.matches("\\d{10}")) {

			return true;
		} else {
			throw new InvalidContactNumberException ("Invalid contact number");
		}

	}

	public boolean validateAddress(String address) {

		if (!(address.isEmpty() || address == null)) {

			return true;
		} else {
			throw new InvalidAddressException("Address can't be empty!!!");

		}

	}

	protected boolean updateInformation(String newAddress, String newContactNumber) {

		if (validateAddress(newAddress) && validateContactNumber(newContactNumber)) {

			address = newAddress;
			contactNumber = newContactNumber;
			System.out.println("Updated Address and Contact number Info...");
			return true;

		} else {
			return false;
		}

	}

	public boolean updateInformation(String newAddress) {
		if (validateAddress(newAddress)) {

			address = newAddress;
			System.out.println("Updated Address Info...");
			return true;

		} else {
			return false;
		}
	}

	public boolean updateInformation(String newContactNumber, boolean update) {
		if (validateContactNumber(newContactNumber)) {

			contactNumber = newContactNumber;
			System.out.println("Updated Contact Info...");
			return true;

		} else {
			return false;
		}
	}

	public static int getTotalPersonCount() {

		return personCount;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ "]";
	}

}
