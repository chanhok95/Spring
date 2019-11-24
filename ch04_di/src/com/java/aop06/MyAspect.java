package com.java.aop06;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public Object advice(ProceedingJoinPoint joinpoint) {
		System.out.println("집에 들어온다.");
		Object obj ="";
		try {
			System.out.println(joinpoint.getTarget().getClass().getName());
			System.out.println(joinpoint.getSignature().getName());
			
			
			 obj = joinpoint.proceed(); //object obj 리턴이있는 경우

		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("화재발생시:119신고");
		}finally {
			System.out.println("문을열고 집을 나온다.");
		}
		return obj;
	}
	
}
