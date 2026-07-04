package com.arrayofobjects;

public class ContactRunner {

	public static void main(String[] args) {


		Contact c1 = new Contact("Raj", "9025394099");
		
		System.out.println(c1);
		
		
		int a[] = new int[3];
		
		for (int i : a) {
			System.out.println(i);
		}
		
		Contact c[] = new Contact[3];
        c[0]= new Contact("Vinay", "9025378940"); 
        c[1]= new Contact("Avatar", "9025378949"); 
        c[2]= new Contact("Sam", "9025378948"); 

		for (Contact contact : c) {
			System.out.println(contact);
		}

	}

}
