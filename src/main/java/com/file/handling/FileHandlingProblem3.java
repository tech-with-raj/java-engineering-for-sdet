package com.file.handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandlingProblem3 {

	public static void main(String[] args) {

		File sourceFile = new File("words.txt");
		File destinationFile = new File("dest.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);
				bw.newLine(); // Moves to the next line in destination file
			}
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
