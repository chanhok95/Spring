package com.java.di;

public class AA { 			//DI:������ �� ������Ƽ�� ������ ���ް��� (�Ϲ��Լ�X) 
	private int a;			
	private int b;
	
	public  AA() {
		System.out.println("������");
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
