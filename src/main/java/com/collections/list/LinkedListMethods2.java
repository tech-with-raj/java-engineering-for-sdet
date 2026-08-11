package com.collections.list;

import java.util.LinkedList;

public class LinkedListMethods2 {

	public static void main(String[] args) {

		LinkedList<String> nameList = new LinkedList<String>();

		nameList.add("Raj");
		nameList.add("Ram");
		nameList.add("Sam");
		nameList.add(null);
		nameList.add("Raj");
		nameList.add(1, "Soni");

		nameList.addFirst("Abi");
		nameList.addLast("Vicky");

		System.out.println(nameList.removeFirst());

		System.out.println(nameList.removeLast());

		System.out.println(nameList);
		
		nameList.removeLast();
		
		
		System.out.println(nameList);

		System.out.println(nameList.getFirst());
		System.out.println(nameList.getLast());
		
		System.out.println(nameList.offerFirst("Hari"));
		System.out.println(nameList.offerLast("Sai"));
		
		System.out.println(nameList);
		
		System.out.println(nameList.pollFirst());
        System.out.println(nameList.pollLast());
        
        System.out.println(nameList);
        
        System.out.println(nameList.peekFirst());
        System.out.println(nameList.peekLast());
        
        System.out.println(nameList);
        
        nameList.push("Sandy");
        System.out.println(nameList);
        System.out.println(nameList.pop());
        System.out.println(nameList);
        
        
	}

}
