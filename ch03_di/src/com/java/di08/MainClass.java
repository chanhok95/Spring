package com.java.di08;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @작성자:길찬호
 * @작성일:2019. 11. 21.
 * @설명: Spring FrameWork 는 설계 기반이 Interface로 되어 있음
 */
public class MainClass {
	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:com/java/di08/appCTX.xml");
		
		Message en =(Message) ctx.getBean("messageEn");
		en.sayHello("spring");
		Message kr =(Message) ctx.getBean("messageKr");
		kr.sayHello("dsds");	
	}
	
}
