package com.collections.list;

import java.util.*;

public class ListPerformanceComparison {

	public static void main(String[] args) {

		int dataSize = 1_000_000; // Number of elements

		// Initialize lists
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		System.out.println("Starting Performance Comparison Between ArrayList and LinkedList\n");

		// Measure Insert
		System.out.println("Measuring Insertion Performance...");
		measureInsertion(arrayList, "ArrayList", dataSize);
		measureInsertion(linkedList, "LinkedList", dataSize);

		// Measure Read
		System.out.println("\nMeasuring Read Performance...");
		measureRead(arrayList, "ArrayList", dataSize);
		measureRead(linkedList, "LinkedList", dataSize);

		// Measure Update
		System.out.println("\nMeasuring Update Performance...");
		measureUpdate(arrayList, "ArrayList", dataSize);
		measureUpdate(linkedList, "LinkedList", dataSize);

		// Measure Delete
		System.out.println("\nMeasuring Deletion Performance...");
		measureDeletion(arrayList, "ArrayList", dataSize);
		measureDeletion(linkedList, "LinkedList", dataSize);
	}

	private static void measureInsertion(List<Integer> list, String listType, int size) {

		long startTime = System.nanoTime();

		for (int i = 0; i < size; i++) {
			list.add(i);
		}

		long endTime = System.nanoTime();

		System.out.println(listType + " Insertion Time : " + (endTime - startTime) / 1_000_000 + " ms");
	}

	private static void measureRead(List<Integer> list, String listType, int size) {

		Random random = new Random();

		long startTime = System.nanoTime();

		for (int i = 0; i < 100_000; i++) {
			int index = random.nextInt(size); // Read random index
			list.get(index);
		}

		long endTime = System.nanoTime();

		System.out.println(listType + " Read Time : " + (endTime - startTime) / 1_000_000 + " ms");
	}

	private static void measureUpdate(List<Integer> list, String listType, int size) {

		Random random = new Random();

		long startTime = System.nanoTime();

		for (int i = 0; i < 100_000; i++) {
			int index = random.nextInt(size); // Update random index
			list.set(index, index * 2);
		}

		long endTime = System.nanoTime();

		System.out.println(listType + " Update Time : " + (endTime - startTime) / 1_000_000 + " ms");
	}

	private static void measureDeletion(List<Integer> list, String listType, int size) {

		long startTime = System.nanoTime();

		for (int i = 0; i < 100_000; i++) {
			list.remove(0); // Remove 100K elements from the start
		}

		long endTime = System.nanoTime();

		System.out.println(listType + " Deletion Time : " + (endTime - startTime) / 1_000_000 + " ms");
	}
}
