package com.student.management.system.oops;

public class RegularStudent extends Student {

	protected RegularStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		percentage = calculatePercentage();
		grade = calculateGrade();
	}

	@Override
	public double calculatePercentage() {

		double percentage = totalMarks / 3.0;
		return percentage;

	}

	public static class RegularStudentBuilder extends StudentBuilder {

		public RegularStudentBuilder(String name, int age, String contactNumber, String address) {
			super(name, age, contactNumber, address);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Student build() {
			Student s1 = new RegularStudent(this);
			return s1;
		}

	}

}
