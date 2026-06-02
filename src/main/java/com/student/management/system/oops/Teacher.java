package com.student.management.system.oops;

public class Teacher extends Person {

	private String empID;
	private String subject;
	private int yearsOfExperience;
	private double salary;

	private final static double BASE_SALARY = 30000;
	private final static double EXPERIENCE_BONUS = 2000;
	
	private static int teacherCount=0;

	public Teacher(String name, int age, String contactNumber, String address, String empID, String subject,
			int yearsOfExperience) {
		super(name, age, contactNumber, address);
		if (validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address) && validateEmpID(empID)
				&& validateSubject(subject) && validateYearsOfExperience(yearsOfExperience)) {
			this.empID = empID;
			this.subject = subject;
			this.yearsOfExperience = yearsOfExperience;
			calculateSalary();
            teacherCount++;
		}
	}

	public boolean validateAge(int age) {

		if (age >= 25 && age <= 65) {
			return true;
		} else {
			System.err.println("Invalid teacher age!!");
			return false;
		}
	}

	public boolean validateContactNumber(String contactNumber) {

		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.out.println("Invalid teacher contact number!!");
			return false;
		}

	}

	public boolean validateAddress(String address) {

		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid teacher address!!");
			return false;
		}
	}

	public boolean validateEmpID(String empID) {

		if (empID.matches("^T\\d{3}$")) {

			return true;
		} else {
			System.err.println("Invalid teacher empID!!");
			return false;
		}

	}

	public boolean validateSubject(String subject) {

		if (!subject.isEmpty()) {

			return true;
		} else {
			System.err.println("Invalid teacher subject!!");
			return false;
		}
	}

	public boolean validateYearsOfExperience(int yearsOfExperience) {

		if (yearsOfExperience >= 0 && yearsOfExperience <= 40) {
			return true;
		} else {
			System.err.println("Invalid teacher experience!!");
			return false;
		}
	}

	private void calculateSalary() {
		if (yearsOfExperience != 0)
			salary = BASE_SALARY + (this.yearsOfExperience * EXPERIENCE_BONUS);

	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		if (validateEmpID(empID))
			this.empID = empID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (validateSubject(subject))
			this.subject = subject;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (validateYearsOfExperience(yearsOfExperience))
			this.yearsOfExperience = yearsOfExperience;
	}

	public double getSalary() {
		return salary;
	}

	public void displayTeacherInformation() {

		System.out.println("------------Teacher Info----------------");
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("EMP-ID: " + empID);
		System.out.println("CONTACT NUMBER: " + contactNumber);
		System.out.println("ADDRESS: " + address);
		System.out.println("SUBJECT: " + subject);
		System.out.println("YEARS OF EXP: " + yearsOfExperience);
		System.out.println("SALARY: $" + salary);
		System.out.println("========================================");
	}
	
	public boolean updateInformation(String newAddress, String newContactNumber) {

		// HR Approval
		System.out.println("Requesting HR Approval");
		boolean hrApprovalStatus = hrApproval();

		if (hrApprovalStatus) {

			// then update Person.address with newAddress and Person.contactNumber with
			// newContactNumber

			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notifying the teacher that info is updated...");
				return true;
			} else {
				System.err.println("No approval from hr...");
				return false;
			}
		}
		
		return false;
	}
	
	
    public boolean updateInformation(String newAddress) {
	
    	System.out.println("Requesting HR Approval");
		boolean hrApprovalStatus = hrApproval();

		if (hrApprovalStatus) {

			if (super.updateInformation(newAddress)) {
				System.out.println("Notifying the teacher that info is updated...");
				return true;
			} else {
				System.err.println("No approval from hr...");
				return false;
			}
		}
		
		return false;
	}
    	
    
    public boolean updateInformation(String newContactNumber, boolean update) {
    	
    	System.out.println("Requesting HR Approval");
    	boolean hrApprovalStatus = hrApproval();
    	
    	if (hrApprovalStatus) {
    		
    		if (super.updateInformation(newContactNumber, true)) {
    			System.out.println("Notifying the teacher that info is updated...");
    			return true;
    		} else {
    			System.err.println("No approval from hr...");
    			return false;
    		}
    	}
    	
    	return false;
    }
    
	

	private boolean hrApproval() {
		System.out.println("HR has approved the request");
		return true; // dummy
	}

	public static int getTotalTeacherCount() {
		return teacherCount;
	}
	
	

	@Override
	public String toString() {
		return "Teacher [empID=" + empID + ", subject=" + subject + ", yearsOfExperience=" + yearsOfExperience
				+ ", salary=" + salary + "]";
	}

	

}
