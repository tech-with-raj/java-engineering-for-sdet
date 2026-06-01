package com.student.management.system.oops;

public class Person {

	protected String name;
	protected int age;
	protected String contactNumber;
	protected String address;

	public Person(String name, int age, String contactNumber, String address) {
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
		this.address = address;
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
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ "]";
	}
	
	

}
