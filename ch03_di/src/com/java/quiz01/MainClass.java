package com.java.quiz01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/java/quiz01/appCTX.xml");
	
		 Yonsan yonsan = (Yonsan) ctx.getBean("yonsan");
		 
		 yonsan.input();
		 yonsan.getYonsan();
		 yonsan.disp();
		 
		 ctx.close();
		
	}

}
