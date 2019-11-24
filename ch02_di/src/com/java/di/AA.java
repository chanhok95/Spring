package com.java.di;

public class AA { 			//DI:생성자 와 프로퍼티만 데이터 전달가능 (일반함수X) 
	private int a;			
	private int b;
	
	public  AA() {
		System.out.println("생성자");
	}
	

	public AA(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	@Override
	public String toString() {
		return "AA [a=" + a + ", b=" + b + "]";
	}

	
	
	
}
