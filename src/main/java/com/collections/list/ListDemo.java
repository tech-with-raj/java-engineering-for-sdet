package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

      List al = new ArrayList();
      
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(10);
      
      al.add("Raj");
      al.add(true);
      al.add(21.1);
      al.add(null);
           
      System.out.println(al);

      System.out.println(al.size());
      
      System.out.println(al.get(2));

//    int x = al.get(2); object ----> int 
      int x = (Integer)al.get(2);
    System.out.println(x);
      
    
	}

}
