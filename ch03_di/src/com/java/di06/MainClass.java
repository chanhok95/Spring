package com.java.di06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config1 = "classpath:com/java/di06/appCTX.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config1);

		StudentInfo studentInfo = (StudentInfo) ctx.getBean("studentInfo");

		studentInfo.print();

		ctx.close();
	}

}
