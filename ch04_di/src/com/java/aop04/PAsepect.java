package com.java.aop04;

import org.aspectj.lang.JoinPoint;

public class PAsepect { //공통 클래스
	//공통함수들

	public void before(JoinPoint joinpoint) {		//핵심함수전
		System.out.println(joinpoint.getTarget().getClass().getName());
		System.out.println("강의장에 들어온다.");
		
		
	}

	
	//예외발생
	public void out(JoinPoint joinPoint) {
		System.out.println("지각을해서 쫒겨난다.");
	}
	
	
	//정상종료
	public void course(JoinPoint joinPoint) {
		System.out.println("열공");
	}
	
	
	
	
	
	
	public void after(JoinPoint joinpoint) {		//핵심함수후
		System.out.println("강의장을 나간다");
	}
	
	
	
}
