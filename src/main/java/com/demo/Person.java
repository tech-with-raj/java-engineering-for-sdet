package com.demo;

import javax.print.attribute.standard.MediaSize.Other;

public class Person {

	private String name;
	private int id;

	public Person() {

		System.out.println("This is from default constructor");

	}

	public Person(String name, int id) {

		this();//default constructor calling
		System.out.println("This is from parameterized constructor");
		this.name = name;
		this.id = id;
	}

	public Person(Person other) {

		System.out.println("This is from copy constructor");
		this.name = other.name;
		this.id = other.id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
