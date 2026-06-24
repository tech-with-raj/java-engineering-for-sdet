package com.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderRunner {

	public static void main(String[] args) {

		File file = new File("text.txt");

		FileReader fileReader;
		int data = 0;
		
		try {
			fileReader = new FileReader(file);
			
			while (data != -1) {
				
				data = fileReader.read();
				System.out.print((char)data);
			}
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
