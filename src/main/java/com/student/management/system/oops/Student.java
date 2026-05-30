package com.student.management.system.oops;

import java.util.Objects;

public class Student {

	private String name;
	private int age;
	private int rollNumber;
	private double markObtainedInEnglish;
	private double markObtainedInMaths;
	private double markObtainedInScience;
	private String grade;

	
	
	
	public Student(String name, int age, int rollNumber, double markObtainedInEnglish, double markObtainedInMaths,
			double markObtainedInScience, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.markObtainedInEnglish = markObtainedInEnglish;
		this.markObtainedInMaths = markObtainedInMaths;
		this.markObtainedInScience = markObtainedInScience;
		this.grade = grade;
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


	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, grade, markObtainedInEnglish, markObtainedInMaths, markObtainedInScience, name,
				rollNumber);
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
		return age == other.age && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(markObtainedInEnglish) == Double
						.doubleToLongBits(other.markObtainedInEnglish)
				&& Double.doubleToLongBits(markObtainedInMaths) == Double.doubleToLongBits(other.markObtainedInMaths)
				&& Double.doubleToLongBits(markObtainedInScience) == Double
						.doubleToLongBits(other.markObtainedInScience)
				&& Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", markObtainedInEnglish="
				+ markObtainedInEnglish + ", markObtainedInMaths=" + markObtainedInMaths + ", markObtainedInScience="
				+ markObtainedInScience + ", grade=" + grade + "]";
	}

	
	
}
