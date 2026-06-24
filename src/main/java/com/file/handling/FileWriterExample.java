package com.file.handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {

		File file = new File("text.txt");

		FileWriter fw;
		try {
			fw = new FileWriter(file, true);
			fw.write("Hello Rajasekar!!!\n");
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
