package com.java.aop02;

public class PersonAspect {			//공통 클래스
	private Person person;
	
	
	
	public PersonAspect(Person person) {		
	this.person = person;
}
	
	public void advice() {
		awake();
		person.work();
		this.sleep();
		
	}
	
	public void awake() {
		System.out.println("일어난다.");		//공통 함수
	}
	public void sleep() {
		System.out.println("잔다");		//공통 함수
	}
}
