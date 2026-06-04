package com.staticexample;

public class Emp {

	private String name;
	public static String companyName;

	static {

		companyName = "TCS";
		System.out.println("I am in the static block");

	}

	static {

		System.out.println("I am in the static block 2");

	}

	static {

		System.out.println("I am in the static block 3");

	}

	public Emp(String name) {
		super();
		this.name = name;
		System.out.println("I am inside the constructor");
	}

}
