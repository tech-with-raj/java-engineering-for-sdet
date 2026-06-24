package com.file.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {

		File myFile = new File("text.txt");

		FileWriter fw;
		BufferedWriter bw;
		
		try {
			fw = new FileWriter(myFile, true);
		    bw = new BufferedWriter(fw);
			bw.write("Hello Java");
			bw.close();

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
