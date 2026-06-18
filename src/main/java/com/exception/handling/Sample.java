package com.exception.handling;

public class Sample {

	public static void main(String[] args) {

         System.out.println("Line1");
         
         try {
        	 
        	 int result = 10/0;
			
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
         
         System.out.println("Line2");
         System.out.println("Line3");
		
	}

}
