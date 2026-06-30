package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingProblem2 {

	public static void main(String[] args) {

//		Problem Statement:
//			------------------
//			Finding the Longest Word in a File
//
//			Write a Java program to find and print the longest word in a text file.
//
//			Requirements:
//			-------------
//			• Use BufferedReader to read the file line by line.
//			• Split each line into words using a suitable delimiter (e.g., whitespace).
//			• Compare the lengths of all words and keep track of the longest word found so far.
//			• Handle potential exceptions, such as the file not being found or access being denied.
//			• Print the longest word at the end of the program execution.
//
//			Example:
//			--------
//			If the content of "words.txt" is:
//
//			Java programming is fun.
//			Finding the longest word is interesting.
//			Let's code more!
//
//			The output of the program should be:
//
//			The longest word is: programming
//
//			Additional Notes:
//			-----------------
//			• Use relative or absolute paths for specifying file locations.
//			• Ignore punctuation if necessary while comparing words.
//			• If multiple words have the same maximum length, print the first one encountered.

		File file = new File("words.txt");

		FileReader fr;
		BufferedReader br;
		String largestWord = "";
		String line = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			while((line = br.readLine()) != null) {
			String[] words =line.split(" ");
			
			for(String word: words) {
				
				if(word.length() > largestWord.length()) {
					
					largestWord = word;
				}
				
			}
			}
		System.out.println("The largest word is "+ largestWord);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
