package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Problem Statement:
 * ------------------
 * Write a Java program that reads a text file and counts the total number
 * of lines and characters present in the file.
 *
 * Requirements:
 * -------------
 * 1. Use BufferedReader to read the file line by line.
 * 2. Count each line to determine the total number of lines.
 * 3. Count the characters in each line to determine the total number of characters.
 * 4. Handle exceptions gracefully if the file does not exist or cannot be accessed.
 * 5. Display:
 *      - Total number of lines in the file.
 *      - Total number of characters in the file.
 *
 * Example Input (input.txt):
 * --------------------------
 * Hello, world!
 * This is a test file.
 * Java file handling is interesting.
 *
 * Example Output:
 * ---------------
 * Total number of lines: 3
 * Total number of characters: 67
 */

public class FileHandlingProblem1 {

	public static void main(String[] args) {

		File file = new File("input.txt");

		FileReader fr;

		BufferedReader br;

		int lineCount = 0;
		int charCount = 0;

		try {
			fr = new FileReader(file);

			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {

				lineCount++;
				
				int lineLength =line.toCharArray().length;
				
				charCount += lineLength;

			}
			
			

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Total number of lines: " + lineCount);
		System.out.println("Total number of characters: " + charCount);

	}

}
