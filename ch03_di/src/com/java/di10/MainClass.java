package com.java.di10;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:com/java/di10/appCTX.xml");
	
		Admin admin = (Admin) ctx.getBean("admin");
		admin.disp();
		
		ctx.close();
	
	}

}
