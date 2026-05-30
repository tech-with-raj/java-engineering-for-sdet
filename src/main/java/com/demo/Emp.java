package com.demo;

public class Emp {

	private String name;

	private Emp(String name) {
		this.name = name;
	}
	
	
	public static Emp objCreation(String name) {
		
		Emp emp = new Emp(name);
		
		return emp;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
