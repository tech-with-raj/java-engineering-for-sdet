package com.student.management.system.oops;

public class Teacher {

	private String name;
	private int age;
	private String contactNumber;
	private String address;
	private String empID;
	private String subject;
	private int yearsOfExperience;
	private double salary;
	
	private final static double BASE_SALARY= 30000;
	private final static double EXPERIENCE_BONUS = 2000;

	public Teacher(String name, int age, String contactNumber, String address, String empID, String subject,
			int yearsOfExperience) {

		if (validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address) && validateEmpID(empID)
				&& validateSubject(subject) && validateYearsOfExperience(yearsOfExperience)) {
			this.name = name;
			this.age = age;
			this.contactNumber = contactNumber;
			this.address = address;
			this.empID = empID;
			this.subject = subject;
			this.yearsOfExperience = yearsOfExperience;
			calculateSalary();

		}
	}

	public boolean validateAge(int age) {

		if (age >= 25 && age <= 65) {
			return true;
		} else {
			System.err.println("Invalid teacher age!!");
			return false;
		}
	}

	public boolean validateContactNumber(String contactNumber) {

		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.out.println("Invalid teacher contact number!!");
			return false;
		}

	}

	public boolean validateAddress(String address) {

		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid teacher address!!");
			return false;
		}
	}

	public boolean validateEmpID(String empID) {

		if (empID.matches("^T\\d{3}$")) {

			return true;
		} else {
			System.err.println("Invalid teacher empID!!");
			return false;
		}

	}

	public boolean validateSubject(String subject) {

		if (!subject.isEmpty()) {

			return true;
		} else {
			System.err.println("Invalid teacher subject!!");
			return false;
		}
	}

	public boolean validateYearsOfExperience(int yearsOfExperience) {

		if (yearsOfExperience >= 0 && yearsOfExperience <= 40) {
			return true;
		} else {
			System.err.println("Invalid teacher experience!!");
			return false;
		}
	}

	private void calculateSalary() {
		if (yearsOfExperience != 0)
			salary = BASE_SALARY + (this.yearsOfExperience * EXPERIENCE_BONUS);

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
		if (validateAge(age)) {
			this.age = age;
		}
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

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		if (validateEmpID(empID))
			this.empID = empID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (validateSubject(subject))
			this.subject = subject;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (validateYearsOfExperience(yearsOfExperience))
			this.yearsOfExperience = yearsOfExperience;
	}

	public double getSalary() {
		return salary;
	}
	
	public void displayTeacherInformation() {

	    System.out.println("------------Teacher Info----------------");
	    System.out.println("NAME: " + name);
	    System.out.println("AGE: " + age);
	    System.out.println("EMP -ID: " + empID);
	    System.out.println("CONTACT NUMBER: " + contactNumber);
	    System.out.println("ADDRESS: " + address);
	    System.out.println("SUBJECT: " + subject);
	    System.out.println("YEARS OF EXP: " + yearsOfExperience);
	    System.out.println("SALARY: $" + salary);
	    System.out.println("========================================");
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", empID=" + empID + ", subject=" + subject + ", yearsOfExperience=" + yearsOfExperience + ", salary="
				+ salary + "]";
	}

}
