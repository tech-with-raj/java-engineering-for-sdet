package com.student.management.system.oops.student.management;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.student.management.system.oops.RegularStudent;
import com.student.management.system.oops.SportStudent;
import com.student.management.system.oops.Student;

public class StudentManager {

	public static void enrollStudent(Scanner scanner) {

		List<Student> studentList = new ArrayList<Student>();

		while (true) {

			System.out.println("Enter Student Name:");
			String studentName = scanner.nextLine();
			System.out.println(studentName);

			System.out.println("Enter Student Age:");
			int studentAge = scanner.nextInt();
			System.out.println(studentAge);

			scanner.nextLine(); // Consume the leftover newline

			System.out.println("Enter Student Address");
			String studentAddress = scanner.nextLine();
			System.out.println(studentAddress);

			System.out.println("Enter Parents Contact Number");
			String parentContactNumber = scanner.nextLine();
			System.out.println(parentContactNumber);

			System.out.println("Enter Student RollNumber:");
			int studentRollNumber = scanner.nextInt();
			System.out.println(studentRollNumber);

			System.out.println("Enter Student Marks in English:");
			int marksObtainedInEnglish = scanner.nextInt();
			System.out.println(marksObtainedInEnglish);

			System.out.println("Enter Student Marks in Science:");
			int marksObtainedInScience = scanner.nextInt();
			System.out.println(marksObtainedInScience);

			System.out.println("Enter Student Marks in Maths:");
			int marksObtainedInMaths = scanner.nextInt();
			System.out.println(marksObtainedInMaths);

			scanner.nextLine();

			System.out.println("Is the Student a sport student? (Yes or No)");
			String isSportStudent = scanner.nextLine();

			if (isSportStudent.equalsIgnoreCase("yes")) {
				System.out.println("Enter Student Score in Sports:");
				int scoreInSports = scanner.nextInt();
				System.out.println(scoreInSports);
				scanner.nextLine();

				studentList.add(new SportStudent.SportStudentBuilder(studentName, studentAge, parentContactNumber,
						studentAddress).withSportsScore(scoreInSports).withMarkObtainedInEnglish(marksObtainedInEnglish)
						.withMarkObtainedInMaths(marksObtainedInMaths).withMarkObtainedInScience(marksObtainedInScience)
						.build());

			} else if (isSportStudent.equalsIgnoreCase("no")) {

				studentList.add(new RegularStudent.RegularStudentBuilder(studentName, studentAge, parentContactNumber,
						studentAddress).withMarkObtainedInEnglish(marksObtainedInEnglish)
						.withMarkObtainedInMaths(marksObtainedInMaths).withMarkObtainedInScience(marksObtainedInScience)
						.withRollNumber(studentRollNumber).build());

			} else {
				throw new IllegalArgumentException("Option to enter is Yes or No");
			}

			System.out.println("Do you want to add another student?(Yes or No)");
			String nextData = scanner.nextLine();
			if (nextData.equalsIgnoreCase("no"))
				break;

		}

		for (Student student : studentList) {
			System.out.println(student);
		}

		serializeStudentData(studentList);

	}

	public static void serializeStudentData(List<Student> studentData) {

		File serializedData = new File("student.ser");

		// Deserialization
		ArrayList<Student> oldStudentList = new ArrayList<Student>();

		FileInputStream fis;
		ObjectInputStream ois;

		try {
			fis = new FileInputStream(serializedData);
			ois = new ObjectInputStream(fis);

			Object obj = ois.readObject();

			if (obj instanceof ArrayList<?>) {

				for (Object o : (ArrayList<?>) obj) {

					if (o instanceof Student) {
						oldStudentList.add((Student) o);
					}
				}
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Add new Student List data to old Student List
		oldStudentList.addAll(studentData);

		// Serialization
		FileOutputStream fos;

		try {
			fos = new FileOutputStream(serializedData);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(oldStudentList);

			System.out.println("Data stored successfully!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeStudentData() {

		File file = new File("Student.ser");

		FileInputStream fos;
		ObjectInputStream ois;
//		Student[] studentData = null;
		List<Student> studentData = new ArrayList<Student>();
		try {
			fos = new FileInputStream(file);
			ois = new ObjectInputStream(fos);
			Object obj = ois.readObject();

			Student[] data;

			if (obj instanceof Student[]) {

				data = (Student[]) obj;

				for (Student s : data) {

					studentData.add(s);
				}
				serializeStudentData(studentData);

			} else if (obj instanceof ArrayList<?>) {

				for (Object o : (ArrayList<?>) obj) {

					if (o instanceof Student) {

						studentData.add((Student) o);
					}
				}
			}

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}

		for (Student s : studentData) {
			System.out.println(s);
		}
	}

}
