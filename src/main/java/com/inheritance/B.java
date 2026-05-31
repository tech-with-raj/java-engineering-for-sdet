package com.inheritance;

public class B extends A {

	int x = 50;
	
	public B(int x, int y) {

		super(x, y);

	}

	public void add() {
//		int x = 100;
		int y = 100;
		
		System.out.println(super.x + y);
	}

}
