package com.student.management.system.oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.student.management.system.oops.student.management.StudentManager;

public class Runner5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out
				.println("******************************** Student Management System ********************************");
		File file = new File("Student.ser");

		if (file.exists()) {

			System.out.println("Data found!!! loading data from old Student.ser file");
			StudentManager.deserializeStudentData();

		} else {

			System.out.println("No backup(student.ser) found!!! Taking input from user...");
			
		}
		
		System.out.println("--------------Main Menu--------------");
		System.out.println("Option 1: Add new student entry");
		System.out.println("Option 2: Exit");
		System.out.println("Enter the Option");
		
		int option = scanner.nextInt();
		scanner.nextLine();
		
		switch (option) {
		case 1:  StudentManager.enrollStudent(scanner);
		case 2: System.exit(0);
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		

       

	}

	
}
