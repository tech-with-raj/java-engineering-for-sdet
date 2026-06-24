package com.file.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterVsFileWriter {

	public static void main(String[] args) {

		fw();

		bw();

	}

	private static void fw() {

		long startTime = System.nanoTime();

		File file = new File("text.txt");

		FileWriter fw;
		try {
			fw = new FileWriter(file, true);
			for (int i = 0; i < 100; i++) {
				fw.write("Hello Java\n");
			}
			
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		long endTime = System.nanoTime();

		long duration = endTime - startTime;

		System.out.println("FWriter took " + duration);
	}

	private static void bw() {

		long startTime = System.nanoTime();

		File myFile = new File("text.txt");

		FileWriter fw;
		BufferedWriter bw;

		try {
			fw = new FileWriter(myFile, true);
			bw = new BufferedWriter(fw);
			for (int i = 0; i < 100; i++) {
			bw.write("Hello Java\n");
			}
			bw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		long endTime = System.nanoTime();

		long duration = endTime - startTime;

		System.out.println("BWriter took " + duration);
	}

}
