package com.file.handling;

import java.io.File;

public class FileRunner2 {

	public static void main(String[] args) {
		
		File file = new File("text.txt");
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println("Can I read the file-"+ file.canRead());
		System.out.println("Can I write the file-"+ file.canWrite());
		System.out.println("Can I execute the file-"+ file.canExecute());
		
		File abcFile = new File("demo\\abc.txt");
		System.out.println(abcFile.isFile());
		System.out.println(abcFile.getParent());
		System.out.println(abcFile.length());
		
		
		File newDirectory = new File("demo");
		newDirectory.mkdir();

		System.out.println(newDirectory.isDirectory());
	}

}
