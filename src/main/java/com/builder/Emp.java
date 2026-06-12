package com.builder;

public class Emp {

	private final String name;
	private final int empID;
	private final double salary;

	private Emp(String name, int empID, double salary) {
		super();
		this.name = name;
		this.empID = empID;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getEmpID() {
		return empID;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", empID=" + empID + ", salary=" + salary + "]";
	}

	public static class Builder {

		private String name;
		private int empID;
		private double salary;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder empID(int empID) {
			this.empID = empID;
			return this;
		}

		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public Emp build() {

			Emp e1 = new Emp(name, empID, salary);

			return e1;
		}

	}

}
