package com.exception.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchWithResource {

	public static void main(String[] args) {

		File file = new File(
				"C:\\Users\\rajas\\git\\java-engineering-for-sdet\\src\\main\\java\\com\\exception\\handling\\demo.txt");

		String data = null;

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

			data = bufferedReader.readLine();

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println(data);

	}

}
