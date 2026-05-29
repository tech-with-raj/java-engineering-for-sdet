package com.student.management.system.oops;

public class Student {

	private String name;
	private int age;
	private int rollNumber;
	private double markObtainedInEnglish;
	private double markObtainedInMaths;
	private double markObtainedInScience;
	private String grade;

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

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void calculateTotalMarks() {

		double totalMarks = markObtainedInEnglish + markObtainedInMaths + markObtainedInScience;

		System.out.println("Total Mark Obtained: " + totalMarks);
	}

}
