package com.student.management.system.oops;

public class CollectionRunner1 {

	public static void main(String[] args) {


		Student s1 = new SportStudent.SportStudentBuilder("Rajasekar", 19, "9442833080",
				"Chennai").withSportsScore(90)
				.withMarkObtainedInEnglish(98)
				.withMarkObtainedInMaths(99)
				.withMarkObtainedInScience(100).withRollNumber(23).build();
		
		Student s2 = new RegularStudent.RegularStudentBuilder("Soniya", 18,
				"9442833080", "Chennai").withMarkObtainedInEnglish(90)
				.withMarkObtainedInMaths(100)
				.withMarkObtainedInScience(100).withRollNumber(22)
				.build();
		
		Student[] studentArray = new Student[2];
		
		studentArray[0] = s1;
		studentArray[1] = s2;
		studentArray[2] = new RegularStudent.RegularStudentBuilder("Vinay", 18,
				"9025394099", "Chennai").withMarkObtainedInEnglish(90)
				.withMarkObtainedInMaths(100)
				.withMarkObtainedInScience(100).withRollNumber(24)
				.build();
		
		
	}

}
