package com.file.handling;

import java.io.File;
import java.io.IOException;

public class FileRunner {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\rajas\\git\\java-engineering-for-sdet\\text.txt");

		if (file.exists()) {

			System.out.println(file.getName() + " file is present");
			System.out.println("Path: " + file.getAbsolutePath());
			
		} else {
			
			System.out.println(file.getName() + "file is not present");
		}
		
		
		File newFile = new File("C:\\Users\\rajas\\git\\java-engineering-for-sdet\\abc.txt");
		
		try {
			
			if(newFile.createNewFile()) {
				
				System.out.println("New file "+ newFile.getName()+" has been created");
			}else {
				
				System.out.println("File has already exist");
			}
			
		} catch (IOException e) {
			
			System.err.println("System can't create "+newFile.getName()+", Something went wrong!");
			e.printStackTrace();
		}
		
		
		if(newFile.delete()) {
			
			System.out.println(newFile.getName()+" deleted successfully");
			
		}else {
			System.out.println("Can't delete "+newFile.getName()+", file is not present!");
		}

	}

}
