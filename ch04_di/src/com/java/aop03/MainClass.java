package com.java.aop03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:com/java/aop03/appCTX.xml");
		
		Person baby = (Person) ctx.getBean("baby"); //공통기능 ,핵심기능        (게속 호출해줘야되는데 해결방안 = AOP)
		baby.work();
		System.out.println();
		
		
		Person mom = (Person) ctx.getBean("mom");
		mom.work();
		System.out.println();
		
		
		Person papa = (Person) ctx.getBean("papa");
		papa.work();
		
	}

}
