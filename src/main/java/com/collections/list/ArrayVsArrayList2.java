package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayVsArrayList2 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		ArrayList<Integer> al = new ArrayList<Integer>();

		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(40);

		System.out.println(Arrays.toString(numbers));
		System.out.println(al);

		System.out.println(al.get(3));
		System.out.println(numbers[3]);

		// Updation
		al.set(0, 3);
		System.out.println(al);

		System.out.println(numbers.length);
		System.out.println(al.size());

		al.remove(0);
		System.out.println(al);

		al.remove(Integer.valueOf(20));
		System.out.println(al);

		System.out.println(al.isEmpty());

		int index = al.indexOf(Integer.valueOf(40));

		System.out.println("Index of 40 is " + index);

		int lastIndex = al.lastIndexOf(40);
		
		System.out.println("Last Index of 40 is " + lastIndex);
		
		
		Collections.sort(al);   		
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);

	}

}
