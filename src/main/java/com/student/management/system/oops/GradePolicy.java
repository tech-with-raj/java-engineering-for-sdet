package com.student.management.system.oops;

public final class GradePolicy {

    private static final int A_PLUS = 95;
    private static final int A_GRADE = 90;
    private static final int B_PLUS = 85;
    private static final int B_GRADE = 80;
    private static final int C_PLUS = 75;
    private static final int C_GRADE = 70;
    private static final int D_GRADE = 60;
	private static final int PASSING_MARKS = 33;
    
    
    private GradePolicy() {
		
	}

    public static String calculateGrade(double percentage) {

        if (percentage >= A_PLUS) {
            return "A+";
        }

        if (percentage >= A_GRADE) {
            return "A";
        }

        if (percentage >= B_PLUS) {
            return "B+";
        }

        if (percentage >= B_GRADE) {
            return "B";
        }

        if (percentage >= C_PLUS) {
            return "C+";
        }

        if (percentage >= C_GRADE) {
            return "C";
        }

        if (percentage >= D_GRADE) {
            return "D";
        }

        return "F";
    }
}