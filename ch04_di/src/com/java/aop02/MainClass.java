package com.java.aop02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:com/java/aop02/appCTX.xml");
		
		PersonAspect baby = (PersonAspect) ctx.getBean("pbaby"); //공통기능 ,핵심기능        (게속 호출해줘야되는데 해결방안 = AOP)
		baby.advice();
		System.out.println();
		
		
		PersonAspect mom = (PersonAspect) ctx.getBean("pmom");
		mom.advice();
		System.out.println();
		
		
		PersonAspect papa = (PersonAspect) ctx.getBean("ppapa");
		papa.advice();
		
		
	}

}
