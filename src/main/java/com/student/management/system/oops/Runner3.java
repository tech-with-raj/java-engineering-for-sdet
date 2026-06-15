package com.student.management.system.oops;

public class Runner3 {

	public static void main(String[] args) {

         Student s1 = new RegularStudent.RegularStudentBuilder("Raj", 20, "9025394099", "Chennai")
        		 .withMarkObtainedInEnglish(98)
        		 .withMarkObtainedInMaths(100)
        		 .withMarkObtainedInScience(89)
        		 .build();
         
         s1.displayStudentInfo();
		
         
         Student s2 = new SportStudent.SportStudentBuilder("Kajal", 20, "9025394099", "Pune")
        		 .withSportsScore(8)
        		 .withMarkObtainedInEnglish(98)
        		 .withMarkObtainedInMaths(100)
        		 .withMarkObtainedInScience(89)
        		 .build();
         
         s2.displayStudentInfo();
		
	}

}
