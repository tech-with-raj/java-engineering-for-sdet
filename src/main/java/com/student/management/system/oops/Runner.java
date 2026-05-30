package com.student.management.system.oops;

public class Runner {

	public static void main(String[] args) {

		Student s1 = new Student("Raj", 19, 21, 90, 90, 89, "A");

		Student s2 = new Student("Vinay", 18, 21, 60, 90, 89, "A");

		Student s3 = new Student("Vinay", 18, 21, 60, 90, 89, "A");

		System.out.println(s1.equals(s2)); // false

		System.out.println(s2.equals(s3)); // true

	}

}
