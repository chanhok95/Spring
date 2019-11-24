package com.java.di07;

public class AA {
	private int x;
	private int y;
	
	public AA() {}
	
	public AA(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	@Override
	public String toString() {
		return "AA [x=" + x + ", y=" + y + "]";
	}
	
	
}
