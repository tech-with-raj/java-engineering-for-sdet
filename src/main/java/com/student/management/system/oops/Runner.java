package com.student.management.system.oops;

public class Runner {

	public static void main(String[] args) {

		Student s1 = new Student("Raj", 19, 21, 90, 90, 89);
        s1.calculateTotalMarks();
        s1.calculatePercentage();
        s1.calculateGrade();
		System.out.println(s1);
		
		
		Student s2 = new Student("Sekar", 24, 20, 90, 90, 99);
		s2.calculateTotalMarks();
		s2.calculatePercentage();
		s2.calculateGrade();
		System.out.println(s2);

	}

}
