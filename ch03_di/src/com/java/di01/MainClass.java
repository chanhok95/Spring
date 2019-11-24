package com.java.di01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
			AA aa = (AA) ctx.getBean("aa"); //object로 반환되니까 형변환
			System.out.println(aa.toString());
			
			ctx.close();
			
	}

}
