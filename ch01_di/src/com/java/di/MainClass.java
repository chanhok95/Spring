package com.java.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	//클래스간 결합이 강해지고 의존성이 높아지면 코드 수정해야하는 범위가 넓어진다.
	//클래스간 결합도 약하게 의존성을 낮게해야한다.
		
		Su su=new Su();
		su.disp();
		
	//DI(Dependency Injection) : 의존성에 대한 설계 패턴 / 외부로부터 전달받는다. (내부적으로 싱글턴)	
	
	
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
	
	Su appSu=(Su) ctx.getBean("su");
	appSu.disp();
	
	
	
	ctx.close();
	
	}
}
