package com.java.aop04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new 
				GenericXmlApplicationContext("classpath:com/java/aop04/appCTX.xml");
		
		
		
		try {
			Person student = (Person) ctx.getBean("student");
			student.work();
			System.out.println();
				
		} catch (Throwable e) {}
			// TODO: handle exception
		try {

			Person teacher = (Person) ctx.getBean("teacher");
			teacher.work();	
		}catch (Throwable e) {}
			// TODO: handle exception
		ctx.close();
		}
	}
