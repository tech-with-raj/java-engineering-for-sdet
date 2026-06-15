package com.student.management.system.oops;

public abstract class Person {

	protected String name;
	protected int age;
	protected String contactNumber;
	protected String address;
	private static int personCount=0;

	public Person(String name, int age, String contactNumber, String address) {

		if (validateAddress(address) && validateContactNumber(contactNumber)) {
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

	public boolean validateContactNumber(String contactNumber) {

		if (contactNumber.matches("\\d{10}")) {

			return true;
		} else {
			System.err.println("Invalid contact number");
			return false;
		}

	}

	public boolean validateAddress(String address) {

		if (!(address.isEmpty() || address == null)) {

			return true;
		} else {
			System.err.println("Invalid person address");
			return false;
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
