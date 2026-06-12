package com.builder;

public class Runner {
	
	public static void main(String[] args) {
		
		Emp emp2 = new Emp.Builder().empID(103).name("soni").salary(10000).build();
		System.out.println(emp2);
	}

}
