package com.student.management.system.oops;

public class Runner {

	public static void main(String[] args) {

		Student s1 = new Student("Raj", 19, 21, 90, 90, 89, "A");

		s1.setName("Rajasekar");
		s1.setAge(21);
		
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		

	}

}
