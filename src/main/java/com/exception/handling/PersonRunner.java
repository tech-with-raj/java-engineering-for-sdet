package com.exception.handling;

public class PersonRunner {

	public static void main(String[] args) {

		Person p1 = null;
		Person p2 = null;
		
		try {
			 p1 = new Person("Raj 123", 27);
			 p2 = new Person("Bala", 125);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		
		System.out.println(p1);
		System.out.println(p2);

	}

}
