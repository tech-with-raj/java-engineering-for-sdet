package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

	public static void main(String[] args) {

		int[] numbers = new int[10];

		ArrayList<Integer> al = new ArrayList<Integer>();

		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		numbers[5] = 60;
		numbers[6] = 70;
		numbers[7] = 80;
		numbers[8] = 90;
		numbers[9] = 100;

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(90);
		al.add(100);

		System.out.println(Arrays.toString(numbers));
		System.out.println(al);
		
		System.out.println(al.get(3));
		System.out.println(numbers[3]);
		
		al.add(1, 55);
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
	}

}
