package com.java.aop06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) throws Throwable {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:com/java/aop06/appCTX.xml");
	
		
		Person man = (Person) ctx.getBean("man");
		String manStr=man.doSomething();
		System.out.println(manStr+"\n");
		
		Person woman = (Person) ctx.getBean("woman");
		String womanStr=woman.doSomething();
		System.out.println(womanStr);
		
		
		
		
		ctx.close();
	}
}	
