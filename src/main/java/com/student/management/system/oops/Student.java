package com.student.management.system.oops;

import java.util.Objects;

public class Student extends Person {

	private int rollNumber;
	private double markObtainedInEnglish;
	private double markObtainedInMaths;
	private double markObtainedInScience;
	private String grade;
	private double totalMarks;
	private double percentage;
	private static int studentCount=0;

	public Student(String name, int age, String contactNumber, String address, int rollNumber,
			double markObtainedInEnglish, double markObtainedInMaths, double markObtainedInScience) {
		super(name, age, contactNumber, address);
		if (validateAge(age) && validateRollNumber(rollNumber) && validateMarks(markObtainedInEnglish)
				&& validateMarks(markObtainedInMaths) && validateMarks(markObtainedInScience)
				&& validateContactNumber(contactNumber) && validateAddress(address)) {

			this.rollNumber = rollNumber;
			this.markObtainedInEnglish = markObtainedInEnglish;
			this.markObtainedInMaths = markObtainedInMaths;
			this.markObtainedInScience = markObtainedInScience;
			studentCount++;
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

		if (age >= 18 && age <= 21) {
			this.age = age;
		} else {
			System.out.println("Age is not valid");
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {

		if (rollNumber >= 0) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("RollNumber is not valid");
		}

	}

	public double getMarkObtainedInEnglish() {
		return markObtainedInEnglish;
	}

	public void setMarkObtainedInEnglish(double markObtainedInEnglish) {

		if (markObtainedInEnglish >= 0 && markObtainedInEnglish <= 100) {

			this.markObtainedInEnglish = markObtainedInEnglish;

		} else {
			System.out.println("Mark Obtained In English is not valid");

		}

	}

	public double getMarkObtainedInMaths() {
		return markObtainedInMaths;
	}

	public void setMarkObtainedInMaths(double markObtainedInMaths) {

		if (markObtainedInMaths >= 0 && markObtainedInMaths <= 100) {

			this.markObtainedInMaths = markObtainedInMaths;

		} else {
			System.out.println("Mark Obtained In Maths is not valid");

		}

	}

	public double getMarkObtainedInScience() {
		return markObtainedInScience;
	}

	public void setMarkObtainedInScience(double markObtainedInScience) {

		if (markObtainedInScience >= 0 && markObtainedInScience <= 100) {

			this.markObtainedInScience = markObtainedInScience;

		} else {
			System.out.println("Mark Obtained In Science is not valid");

		}

	}

	public String getGrade() {
		return grade;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public void calculateTotalMarks() {

		totalMarks = markObtainedInEnglish + markObtainedInMaths + markObtainedInScience;

	}

	public void calculatePercentage() {

		percentage = totalMarks / 3;

	}

	public void calculateGrade() {

		if (percentage == 0) {

			grade = "Cannot be calculated";
		} else {

			if (percentage >= 95) {
				grade = "A+";
			} else if (percentage >= 90) {
				grade = "A";
			} else if (percentage >= 85) {
				grade = "B+";
			} else if (percentage >= 80) {
				grade = "B";
			} else if (percentage >= 75) {
				grade = "C+";
			} else if (percentage >= 70) {
				grade = "C+";
			} else {
				grade = "F";
			}
		}
	}

	public boolean validateAge(int age) {

		if (age >= 10 && age <= 25) {
			return true;
		} else {
			System.err.println("Invalid age for student!!");
			return false;
		}
	}

	public boolean validateRollNumber(int rollNumber) {

		if (rollNumber > 0) {
			return true;
		} else {
			System.err.println("Invalid Roll Number for student!!");
			return false;
		}
	}

	public boolean validateMarks(Double mark) {

		if (mark >= 0 && mark <= 100) {
			return true;
		} else {
			System.err.println("Invalid marks for student!!");
			return false;
		}
	}

	public boolean validateAddress(String address) {
		if (address.isEmpty()) {
			System.err.println("Invalid address for student!!");
			return false;
		} else {

			return true;

		}
	}

	public boolean validateContactNumber(String contactNumber) {

		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid contact number for student!!");
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, contactNumber, grade, markObtainedInEnglish, markObtainedInMaths,
				markObtainedInScience, name, percentage, rollNumber, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && contactNumber == other.contactNumber
				&& Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(markObtainedInEnglish) == Double
						.doubleToLongBits(other.markObtainedInEnglish)
				&& Double.doubleToLongBits(markObtainedInMaths) == Double.doubleToLongBits(other.markObtainedInMaths)
				&& Double.doubleToLongBits(markObtainedInScience) == Double
						.doubleToLongBits(other.markObtainedInScience)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}

	public void displayStudentInfo() {

		System.out.println("------Student Information------");
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("CONTACT NUMBER: " + contactNumber);
		System.out.println("ADDRESS: " + address);

		System.out.println("ENGLISH MARKS: " + markObtainedInEnglish);
		System.out.println("MATHS MARKS: " + markObtainedInMaths);
		System.out.println("SCIENCE MARKS: " + markObtainedInScience);

		System.out.println("---------------------------------------");

		System.out.println("TOTAL MARKS: " + totalMarks);
		System.out.println("PERCENTAGE: " + percentage + "%");
		System.out.println("GRADE: " + grade);

		System.out.println("===========================================");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", rollNumber=" + rollNumber + ", markObtainedInEnglish=" + markObtainedInEnglish
				+ ", markObtainedInMaths=" + markObtainedInMaths + ", markObtainedInScience=" + markObtainedInScience
				+ ", grade=" + grade + ", totalMarks=" + totalMarks + ", percentage=" + percentage + "]";
	}

	public boolean updateInformation(String newAddress, String newContactNumber) {

		// Parent Approval
		System.out.println("Requesting Parent Approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {

			// then update Person.address with newAddress and Person.contactNumber with
			// newContactNumber

			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notifying the parent...");
				return true;
			} else {
				System.err.println("No approval from parent...");
				return false;
			}
		}

		return false;
	}

	public boolean updateInformation(String newAddress) {

		// Parent Approval
		System.out.println("Requesting Parent Approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {

			// then update Person.address with newAddress and Person.contactNumber with
			// newContactNumber

			if (super.updateInformation(newAddress)) {
				System.out.println("Notifying the parent...");
				return true;
			} else {
				System.err.println("No approval from parent...");
				return false;
			}
		}

		return false;
	}

	public boolean updateInformation(String newContactNumber, boolean update) {

		// Parent Approval
		System.out.println("Requesting Parent Approval");
		boolean parentApprovalStatus = parentApproval();

		if (parentApprovalStatus) {

			// then update Person.address with newAddress and Person.contactNumber with
			// newContactNumber

			if (super.updateInformation(newContactNumber, true)) {
				System.out.println("Notifying the parent...");
				return true;
			} else {
				System.err.println("No approval from parent...");
				return false;
			}
		}

		return false;
	}

	private boolean parentApproval() {
		return true; // dummy
	}

	public static int getTotalStudentCount() {
		return studentCount;
	}

}
