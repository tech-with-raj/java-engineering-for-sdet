package com.student.management.system.oops;

public class Runner {

	public static void main(String[] args) {

		Student s1 = new Student("Raj", 19, "9025634088", "No:102, Green's road, Chennai", 21, 90, 90, 89);
		s1.calculateTotalMarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		s1.displayStudentInfo();


		Teacher t1 = new Teacher("Durai", 40, "9025394099", "No:5, ECR, Chennai", "T109", "Maths", 15);
		t1.displayTeacherInformation();

	}

}
