package com.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExamples {

	public static void main(String[] args) {

		File file = new File("data.txt");

		PrintWriter pw;

		float percentage = 78.3454f;

		try {

			pw = new PrintWriter(file);
			pw.write("This is a random Text \n");
			pw.write("Name\tMarks\n");

			pw.format("%-10s %-3d%n", "Raj", 75);
			pw.format("%-10s %-3d%n", "Vinay", 85);
			pw.format("%-10s %-3d%n", "Ram", 89);

			pw.format("%-10s %-3.2f%n", "Ramesh", percentage);

			pw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
