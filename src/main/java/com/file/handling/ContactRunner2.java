package com.file.handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ContactRunner2 {

	public static void main(String[] args) {

		

		try {
			FileInputStream fileInputStream = new FileInputStream("contact.ser");
			try (ObjectInputStream obo = new ObjectInputStream(fileInputStream)) {
				Contact data = (Contact) obo.readObject();
				System.out.println(data);
			}


		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
