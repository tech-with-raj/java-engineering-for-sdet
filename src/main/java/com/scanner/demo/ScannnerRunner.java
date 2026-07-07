package com.scanner.demo;

import java.util.Scanner;

public class ScannnerRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your age: ");

		int age = scanner.nextInt();

		System.out.println(age);

		scanner.nextLine();

		System.out.println("Enter your name: ");

		String name = scanner.nextLine();

		System.out.println("Entered name is " + name);

		System.out.println("Enter percentage: ");

		float percentage = scanner.nextFloat();

		System.out.println("Entered percentage is " + percentage);

		System.out.println("Enter double value: ");

		double doubleValue = scanner.nextDouble();

		System.out.println("Entered double value is " + doubleValue);

		System.out.println("Enter boolean value");

		boolean status = scanner.nextBoolean();

		System.out.println("Entered boolean value is " + status);

		System.out.println("Enter char: ");

		char c = scanner.next().charAt(0);
		
		System.out.print("Entered char is "+c);

	}

}
