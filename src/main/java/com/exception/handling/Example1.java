package com.exception.handling;

public class Example1 {

	public static void main(String[] args) {

		try {
			int number = 10 / 10;

			Person person = null;

			person.getName();

			int[] number1 = new int[3];

			System.out.println(number1[5]);

		} catch (ArithmeticException e) {

			System.err.println(e.getMessage());

		} catch (NullPointerException e) {

			System.err.println(e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.err.println(e.getMessage());
		}

	}

}
