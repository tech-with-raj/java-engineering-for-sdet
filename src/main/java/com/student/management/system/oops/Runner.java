package com.student.management.system.oops;

public class Runner {

	public static void main(String[] args) {

		Person s1 = new Student("Raj", 19, "9025634088", "No:102, Green's road, Chennai", 21, 90, 90, 89);
		((Student) s1).calculateTotalMarks();
		((Student) s1).calculatePercentage();
		((Student) s1).calculateGrade();
		((Student) s1).displayStudentInfo();
		s1.updateInformation("Bangalore", "9025394077");
		((Student) s1).displayStudentInfo();

		Person t1 = new Teacher("Durai", 40, "9025394099", "No:5, ECR, Chennai", "T109", "Maths", 15);
		((Teacher) t1).displayTeacherInformation();
		((Teacher) t1).updateInformation("Bangalore", "9025394077");
		((Teacher) t1).displayTeacherInformation();

	}

}
