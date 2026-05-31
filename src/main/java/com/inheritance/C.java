package com.inheritance;

public class C extends A {

	private int z;

	public C(int x, int y,int z) {
        super(x, y);
		this.z = z;
	}

	public void add() {
		System.out.println(x + y + z);
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
