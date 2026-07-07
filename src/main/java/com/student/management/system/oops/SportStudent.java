package com.student.management.system.oops;

public class SportStudent extends Student {

	private double sportsScore;

	private SportStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);

		this.sportsScore = ((SportStudentBuilder) studentBuilder).sportsScore;
		percentage = calculatePercentage();
		grade = calculateGrade();
	}

	@Override
	public double calculatePercentage() {

		double percentage = ((totalMarks / 3.0) * 0.8) + (sportsScore * 0.2);
		return percentage;

	}

	@Override
	public String toString() {
		return "SportStudent [sportsScore=" + sportsScore + ", totalMarks=" + totalMarks + ", percentage=" + percentage
				+ ", grade=" + grade + ", name=" + name + ", age=" + age + ", contactNumber=" + contactNumber
				+ ", address=" + address + "]";
	}

	public static class SportStudentBuilder extends StudentBuilder {

		private double sportsScore;

		public SportStudentBuilder(String name, int age, String contactNumber, String address) {
			super(name, age, contactNumber, address);
			// TODO Auto-generated constructor stub
		}

		public SportStudentBuilder withSportsScore(int sportsScore) {

			if (sportsScore >= 0 && sportsScore <= 100) {
				this.sportsScore = sportsScore;
			}
			return this;

		}

		@Override
		public Student build() {

			Student s1 = new SportStudent(this);
			return s1;
		}

	}

}
