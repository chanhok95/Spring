package com.java.aop01;

public class Baby implements Person{

	@Override
	public void awake() {
		// TODO Auto-generated method stub
		
		System.out.println("일어난다");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("유치원간다");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("잔다");
	}

}
