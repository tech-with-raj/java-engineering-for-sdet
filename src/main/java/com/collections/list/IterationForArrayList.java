package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationForArrayList {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<Integer>();

		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);

		System.out.println(numberList);

//		for (int index = 0; index < numberList.size(); index++) {
//
//			System.out.println(numberList.get(index));
//
//		}

//		for(Integer intData:numberList) {
//			System.out.println(intData);
//		}

//		Iterator<Integer> numberlistIterator = numberList.iterator();

//		while (numberlistIterator.hasNext()) {

//			System.out.println(numberlistIterator.next());
//		}
		
		
//		numberList.forEach(x -> System.out.println(x));
		
//		numberList.forEach(System.out::println);
		
		
		Iterator<Integer> numberlistIterator = numberList.iterator();

//		numberlistIterator.forEachRemaining(x -> System.out.println(x));
		numberlistIterator.forEachRemaining(System.out::println);
		
	}

}
