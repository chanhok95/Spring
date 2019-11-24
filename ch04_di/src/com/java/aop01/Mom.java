package com.java.aop01;

public class Mom implements Person{

	@Override
	public void awake() {
		// TODO Auto-generated method stub
		System.out.println("일어난다.");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("집안일 한다.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("잔다.");
	}

}
