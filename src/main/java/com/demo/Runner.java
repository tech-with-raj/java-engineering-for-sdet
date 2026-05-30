package com.demo;

public class Runner {

	public static void main(String[] args) {

		Person person = new Person("Raj", 24);

		Person p1 = new Person(person);

		System.out.println(p1.getName());
		System.out.println(p1.getId());

	}
}
