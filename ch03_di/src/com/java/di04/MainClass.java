package com.java.di04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(
				"classpath:com/java/di04/appCTX.xml");

		AA aa = (AA) ctx.getBean("aa");
		System.out.println(aa.toString());

		ctx.close();

	}

}
