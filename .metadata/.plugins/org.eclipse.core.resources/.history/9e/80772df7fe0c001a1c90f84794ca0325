package com.java.aop;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
	public static Logger logger = null;
	public static final String logMsg = "LogMsg----------------------------------";
	
	public Object advice(ProceedingJoinPoint joinPoint) {
		
		Object obj = null;
		
		try {
			
			logger = Logger.getLogger(joinPoint.getTarget().getClass().getName() + joinPoint.getSignature().getName());
			
			obj = joinPoint.proceed();
		}
		catch(Throwable e){
			e.printStackTrace();
		}

		return joinPoint;
		
	}
	
}
