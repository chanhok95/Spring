package com.java.aop05;

import org.aspectj.lang.ProceedingJoinPoint;

public class PAsepect { //공통 클래스
	
	//핵심함수 실행전
	public void getAround(ProceedingJoinPoint joinPoint) {
		System.out.println("강의장에 들어온다.");
		//aop:before
		try {
			//work()-pointcut 
			System.out.println(joinPoint.getTarget().getClass().getName());	
			System.out.println(joinPoint.getSignature().getName());		//함수이름 출력
			
			joinPoint.proceed();
				
			
				//정상종료 aop:after-returning
			System.out.println("열공");
		} catch (Throwable e) {
			System.out.println("지각을해서 쫒겨난다"); // 예외발생 aop:after-throwing
		}finally {
			System.out.println("강의장을 나간다"); //핵심함수 실행후 aop:after
		}
		
	}
	
}
