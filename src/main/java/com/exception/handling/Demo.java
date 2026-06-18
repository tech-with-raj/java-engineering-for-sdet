package com.exception.handling;

public class Demo {

	public static void main(String[] args) {

        int[] a = new int[3];
        
        a[0]=10;
        a[1]=20;
        a[2]=30;
        
        try {
        	a[3]=40;
        	
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
        
		  
		for (int i : a) {
			System.out.println(i);
		}
        
	}

}
