package com.java.aop;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {

	public static Logger logger = Logger.getLogger(LogAspect.class.getName());
	public static final String logMsg = "LogMsg---------------------";
	
	public Object advice(ProceedingJoinPoint joinPonit) {
		Object obj = null;
		try {
			logger.info(logMsg+joinPonit.getTarget().getClass().getName()+"\t\t"+joinPonit.getSignature().getName());
			obj = joinPonit.proceed();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		
		return obj;
		
		
		
	}
}
