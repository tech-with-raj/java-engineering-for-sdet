package com.exception.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example5 {

	public static void main(String[] args) {

		File file = new File(
				"C:\\Users\\rajas\\git\\java-engineering-for-sdet\\src\\main\\java\\com\\exception\\handling\\demo.txt");

		FileReader fileReader;
		BufferedReader bufferedReader = null;
		String data = null;

		try {

			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			data = bufferedReader.readLine();
			

		} catch (IOException e) {

			e.printStackTrace();
		}

		finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(data);

	}

}
