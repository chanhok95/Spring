package com.java.di07;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @작성자:길찬호
 * @작성일:2019. 11. 21.
 * @설명: alt+shift+j 주석설명 단축키
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String config1 ="classpath:com/java/di07/appCTX01.xml";
		String config2 ="classpath:com/java/di07/appCTX02.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config1,config2);
		
		AA aa =(AA) ctx.getBean("aa");
		System.out.println(aa.toString());
		
		BB bb = (BB) ctx.getBean("bb");
		System.out.println(bb.toString());
		
		ctx.close();
	}

}
