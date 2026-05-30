package com.student.management.system.oops;

import java.util.Objects;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Student {

	private String name;
	private int age;
	private int rollNumber;
	private double markObtainedInEnglish;
	private double markObtainedInMaths;
	private double markObtainedInScience;
	private String grade;
	private double totalMarks;
	private double percentage;

	public Student(String name, int age, int rollNumber, double markObtainedInEnglish, double markObtainedInMaths,
			double markObtainedInScience) {

		if (validateAge(age) && validateRollNumber(rollNumber) && validateMarks(markObtainedInEnglish)
				&& validateMarks(markObtainedInMaths) && validateMarks(markObtainedInScience)) {
			this.name = name;
			this.age = age;
			this.rollNumber = rollNumber;
			this.markObtainedInEnglish = markObtainedInEnglish;
			this.markObtainedInMaths = markObtainedInMaths;
			this.markObtainedInScience = markObtainedInScience;
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

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, markObtainedInEnglish, markObtainedInMaths, markObtainedInScience, name,
				percentage, rollNumber, totalMarks);
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
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", markObtainedInEnglish="
				+ markObtainedInEnglish + ", markObtainedInMaths=" + markObtainedInMaths + ", markObtainedInScience="
				+ markObtainedInScience + ", grade=" + grade + ", totalMarks=" + totalMarks + ", percentage="
				+ percentage + "]";
	}

}
