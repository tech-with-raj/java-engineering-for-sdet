package com.file.handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ContactRunner {

	public static void main(String[] args) {

		Contact contactOne = new Contact("Raj", "9025394099", "9020202020");

		System.out.println(contactOne);

		try {
			FileOutputStream fOutputStream = new FileOutputStream("contact.ser");
			ObjectOutputStream obo = new ObjectOutputStream(fOutputStream);
			obo.writeObject(contactOne);
			
			System.out.println("Object has been Serialized");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
