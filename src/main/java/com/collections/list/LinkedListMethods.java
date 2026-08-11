package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList<String> nameList = new LinkedList<String>();

		nameList.add("Raj");
		nameList.add("Ram");
		nameList.add("Sam");
		nameList.add(null);
		nameList.add("Raj");

		nameList.add(1, "Soni");

//		String dataString = nameList.remove();
//		System.out.println(dataString);
//
//		String dataString2 = nameList.remove(0);
//		
//		System.out.println(dataString2);

//		nameList.remove("Sam");

		String data = nameList.get(3);

		System.out.println(data);

		nameList.set(3, "Tom");

		boolean containData = nameList.contains("Raj");

		System.out.println(containData);

		System.out.println(nameList);

		ArrayList<String> aList = new ArrayList<String>();

		aList.add("Rohit");
		aList.add("Hari");
		aList.add("Raja");

		nameList.addAll(aList);

		System.out.println(nameList);

		System.out.println(nameList.size());

//		nameList.clear();

		System.out.println(nameList);

//		for(int index = 0; index < nameList.size(); index++ ) {
//			
//			System.out.println(nameList.get(index));
//		}

//		for (String name : nameList) {
//
//			System.out.println(name);
//		}

//		Iterator<String> it = nameList.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		nameList.forEach(System.out::println);
		
	}

}
