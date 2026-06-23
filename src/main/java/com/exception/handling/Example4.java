package com.exception.handling;

public class Example4 {

	public static void main(String[] args) {

		try {
			int number = 10 / 10;

			Person person = null;

			person.getName();

			int[] number1 = new int[3];

			System.out.println(number1[5]);

		} 
		
		finally {
			System.out.println("This is from finally block");
		}

	}

}
