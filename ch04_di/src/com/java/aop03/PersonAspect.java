package com.java.aop03;


import org.aspectj.lang.JoinPoint;

public class PersonAspect {			//공통 클래스

	
	
	
	
	public void awake(JoinPoint joinPoint) {			//Joinpoint핵심 클래스 핵심함수가 넘어옴 스프링에서 제공되는 함수
		System.out.println("일어난다.");					//공통 함수
	
		System.out.println(joinPoint.getTarget().getClass().getName()); //값의 전달이 잘되는지 JoinPointer 내장함수를 이용해서 확인
	}
	public void sleep(JoinPoint joinPoint) {
		System.out.println("잔다");						//공통 함수
	}
}
