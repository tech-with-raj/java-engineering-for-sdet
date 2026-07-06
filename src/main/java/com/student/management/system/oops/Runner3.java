package com.student.management.system.oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner3 {

	public static void main(String[] args) {

		File file = new File("Student.ser");

		if (file.exists()) {

			System.out.println("Data found!!! loading data from old Student.ser file");
			deserializeData();

		} else {

			System.out.println("Data not found!!! Entering new data!!!");

			Student s1 = new RegularStudent.RegularStudentBuilder("Raj", 20, "9025394099", "Chennai")
					.withMarkObtainedInEnglish(98).withMarkObtainedInMaths(100).withMarkObtainedInScience(89).withRollNumber(20).build();

//	         s1.displayStudentInfo();

			Student s2 = new SportStudent.SportStudentBuilder("Kajal", 20, "9025394099", "Pune").withSportsScore(8)
					.withMarkObtainedInEnglish(98).withMarkObtainedInMaths(100).withMarkObtainedInScience(89).build();

//	         s2.displayStudentInfo();
			
			Student s3 = new SportStudent.SportStudentBuilder("Rohan", 20, "9025394090", "Kolkata").withSportsScore(8)
					.withMarkObtainedInEnglish(98).withMarkObtainedInMaths(100).withMarkObtainedInScience(89).build();

			Student[] studentArray = new Student[3];

			studentArray[0] = s1;
			studentArray[1] = s2;
			studentArray[2] = s3;

			for (Student student : studentArray) {
				System.out.println(student);
			}

			serializeData(studentArray);

		}

	}

	private static void serializeData(Student[] studentArray) {
		File file = new File("Student.ser");
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(studentArray);
			System.out.println("Data stored successfully!!!");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private static void deserializeData() {

		File file = new File("Student.ser");

		FileInputStream fos;
		ObjectInputStream ois;
		Student[] studentData = null;
		try {
			fos = new FileInputStream(file);
			ois = new ObjectInputStream(fos);
			studentData = (Student[]) ois.readObject();

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}

		for (Student s : studentData) {
			System.out.println(s);
		}
	}

}
