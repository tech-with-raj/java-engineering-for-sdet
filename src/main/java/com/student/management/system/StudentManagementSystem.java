package com.student.management.system;

import java.util.Iterator;
import java.util.Scanner;

public class StudentManagementSystem {

	// Store the information of Student
	public static String[] studentName = new String[100];
	public static int[] studentAge = new int[100];
	public static double[] marksObtainedInEnglish = new double[100];
	public static double[] marksObtainedInScience = new double[100];
	public static double[] marksObtainedInMaths = new double[100];
	public static String[] studentGrade = new String[100];
	public static int[] studentRollNumber = new int[100];
	public static Scanner scanner = new Scanner(System.in);
	public static int index = 0;

	public static void main(String[] args) {

		while (true) {

			int options;
			System.out.println("Student Management System");
			System.out.println("1. Add New Student");
			System.out.println("2. Print Student Details");
			System.out.println("3. Print All Student Details");
			System.out.println("4. Exit");

			System.out.println("Enter an option [1-4]");
			options = scanner.nextInt();

			switch (options) {
			case 1:
				addStudent();
				break;

			case 2:
				printStudentInfomation();
				break;

			case 3:
				printAllStudentInfomation();
				break;

			case 4:
				exitApp();
				break;

			}

		}
	}

	private static void printStudentInfomation() {
		System.out.println("Enter Student Index:");
		int userIndex = scanner.nextInt();

		System.out.println("Student Name:" + studentName[userIndex]);
		System.out.println("Student Age:" + studentAge[userIndex]);
		System.out.println("Student RollNumber:" + studentRollNumber[userIndex]);
		System.out.println("Marks Obtained:");
		System.out.println("English:" + marksObtainedInEnglish[userIndex]);
		System.out.println("Maths:" + marksObtainedInMaths[userIndex]);
		System.out.println("Science:" + marksObtainedInScience[userIndex]);
		System.out.println("Student Grade:" + studentGrade[userIndex]);

	}

	private static void printAllStudentInfomation() {

		if (index == 0) {
			System.out.println("There is no student data available in app");

		}

		for (int i = 0; i < index; i++) {

			System.out.println("Student Name:" + studentName[i]);
			System.out.println("Student Age:" + studentAge[i]);
			System.out.println("Student RollNumber:" + studentRollNumber[i]);
			System.out.println("Marks Obtained:");
			System.out.println("English:" + marksObtainedInEnglish[i]);
			System.out.println("Maths:" + marksObtainedInMaths[i]);
			System.out.println("Science:" + marksObtainedInScience[i]);
			System.out.println("Student Grade:" + studentGrade[i]);

			System.out.println("=====================================================");

		}

	}

	private static void exitApp() {

		System.out.println("Exit from the App....");
		System.exit(0);
	}

	public static void addStudent() {

		System.out.println("Enter Student Name:");
		studentName[index] = scanner.next();

		System.out.println("Enter Student Age:");
		studentAge[index] = scanner.nextInt();

		System.out.println("Enter Student Roll Number:");
		studentRollNumber[index] = scanner.nextInt();

		System.out.println("Enter Mark For English:");
		marksObtainedInEnglish[index] = scanner.nextDouble();

		System.out.println("Enter Mark For Science:");
		marksObtainedInScience[index] = scanner.nextDouble();

		System.out.println("Enter Mark For Maths:");
		marksObtainedInMaths[index] = scanner.nextDouble();

		double totalMarksObtained = marksObtainedInEnglish[index] + marksObtainedInMaths[index]
				+ marksObtainedInScience[index];
		double percentageObtained = totalMarksObtained / 3.0;

		if (percentageObtained >= 95) {
			studentGrade[index] = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[index] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[index] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[index] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[index] = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade[index] = "C+";
		} else {
			studentGrade[index] = "F";
		}

		index++;
		System.out.println("Student Information Stored Succesfully");

	}

}