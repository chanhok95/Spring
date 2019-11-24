package com.java.di09;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ClassMain {
	public static void main(String[] args) {

		//생명주기 :컨테이너생성 -컨테이너설정 - 빈초기화 -컨테이너 사용 - 컨테이너 종료
		
		
		System.out.println("1.컨테이너 생성-----------------");
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext();

		System.out.println("2.컨티에너 설정-----------------");
		ctx.load("classpath:com/java/di09/appCTX.xml");
		
		System.out.println("3-1.빈 초기화--------------------");
		ctx.refresh();	//함수호출
		System.out.println("4.컨테이너 사용-------------------");
		
		IMsg msg = (IMsg) ctx.getBean("msg");
		System.out.println(msg.toString());		
		
		
		System.out.println("5-2.컨테이너 종료----------------------");
		ctx.destroy(); //bean만소멸되고 자원은 반납이 안됨
//		ctx.close(); //함수호출 bean,자원 둘다 소멸 반납 
		
	}

	
	

}
