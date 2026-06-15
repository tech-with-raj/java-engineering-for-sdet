package com.student.management.system.oops;

import java.util.Objects;

public abstract class Student extends Person {

	private final int rollNumber;
	private final double markObtainedInEnglish;
	private final double markObtainedInMaths;
	private final double markObtainedInScience;
	protected final double totalMarks;
	protected double percentage;
	protected String grade;
	private static int studentCount = 0;

//	public Student(String name, int age, String contactNumber, String address, int rollNumber,
//			double markObtainedInEnglish, double markObtainedInMaths, double markObtainedInScience) {
//		super(name, age, contactNumber, address);
//		 {
//
//			this.rollNumber = rollNumber;
//			this.markObtainedInEnglish = markObtainedInEnglish;
//			this.markObtainedInMaths = markObtainedInMaths;
//			this.markObtainedInScience = markObtainedInScience;
//			studentCount++;
//		}
//	}

	protected Student(StudentBuilder studentBuilder) {

		super(studentBuilder.name, studentBuilder.age, studentBuilder.contactNumber, studentBuilder.address);
		this.rollNumber = studentBuilder.rollNumber;
		this.markObtainedInEnglish = studentBuilder.markObtainedInEnglish;
		this.markObtainedInMaths = studentBuilder.markObtainedInMaths;
		this.markObtainedInScience = studentBuilder.markObtainedInScience;
		totalMarks = calculateTotalMarks();
		
		studentCount++;

	}

	public int getRollNumber() {
		return rollNumber;
	}

	public double getMarkObtainedInEnglish() {
		return markObtainedInEnglish;
	}

	public double getMarkObtainedInMaths() {
		return markObtainedInMaths;
	}

	public double getMarkObtainedInScience() {
		return markObtainedInScience;
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

	public final double calculateTotalMarks() {

		double totalMarks = markObtainedInEnglish + markObtainedInMaths + markObtainedInScience;

		return totalMarks;

	}

	public abstract double calculatePercentage();

	public final String calculateGrade() {
		String grade;
		if (percentage == 0) {

			grade = "Cannot be calculated";
		} else {

			grade = GradePolicy.calculateGrade(percentage);
		}

		return grade;
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

	public abstract static class StudentBuilder {

		private String name;
		private int age;
		private String contactNumber;
		private String address;

		private int rollNumber;
		private double markObtainedInEnglish;
		private double markObtainedInMaths;
		private double markObtainedInScience;

		public StudentBuilder(String name, int age, String contactNumber, String address) {

			if (validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address)) {

				this.name = name;
				this.age = age;
				this.contactNumber = contactNumber;
				this.address = address;
			}
		}

		public StudentBuilder withRollNumber(int rollNumber) {

			if (validateRollNumber(rollNumber))
				this.rollNumber = rollNumber;
			return this;
		}

		public StudentBuilder withMarkObtainedInEnglish(double markObtainedInEnglish) {
			if (validateMarks(markObtainedInEnglish))
				this.markObtainedInEnglish = markObtainedInEnglish;
			return this;
		}

		public StudentBuilder withMarkObtainedInMaths(double markObtainedInMaths) {
			if (validateMarks(markObtainedInMaths))
				this.markObtainedInMaths = markObtainedInMaths;
			return this;
		}

		public StudentBuilder withMarkObtainedInScience(double markObtainedInScience) {
			if (validateMarks(markObtainedInScience))
				this.markObtainedInScience = markObtainedInScience;
			return this;
		}

		public abstract Student build();

		private boolean validateAge(int age) {

			if (age >= 10 && age <= 25) {
				return true;
			} else {
				System.err.println("Invalid age for student!!");
				return false;
			}
		}

		private boolean validateContactNumber(String contactNumber) {

			if (contactNumber != null && contactNumber.matches("\\d{10}")) {
				return true;
			} else {
				System.err.println("Invalid contact number for student!!");
				return false;
			}
		}

		private boolean validateAddress(String address) {
			if (address.isEmpty()) {
				System.err.println("Invalid address for student!!");
				return false;
			} else {

				return true;

			}
		}

		private boolean validateRollNumber(int rollNumber) {

			if (rollNumber > 0) {
				return true;
			} else {
				System.err.println("Invalid Roll Number for student!!");
				return false;
			}
		}

		private boolean validateMarks(Double mark) {

			if (mark >= 0 && mark <= 100) {
				return true;
			} else {
				System.err.println("Invalid marks for student!!");
				return false;
			}
		}
	}

}
