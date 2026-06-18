package com.exception.handling;

public class PersonRunner {

	public static void main(String[] args) {

            Person p = null;
            
            try {
            System.out.println(p.getName());
            }
            catch(NullPointerException e) {
            	
            	System.out.println(e.getMessage());
            }

	}

}
