package com.student.management.system.oops;

public class Runner {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.setName("Rajasekar");
		s1.setAge(12);
		s1.setRollNumber(-1);
		s1.setMarkObtainedInEnglish(900);
		s1.setMarkObtainedInMaths(1000);
		s1.setMarkObtainedInScience(990);
		s1.setGrade("A+");
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getMarkObtainedInEnglish());
		System.out.println(s1.getMarkObtainedInMaths());
		System.out.println(s1.getMarkObtainedInScience());
		System.out.println(s1.getGrade());
		
		
		s1.calculateTotalMarks();
	}

}
