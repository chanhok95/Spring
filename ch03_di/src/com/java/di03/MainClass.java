package com.java.di03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA a = new AA(10,20);		//AA는 생성자를 통해서 값전달  (constructor-arg)
		BB b = new BB();			//BB는 set으로 전달 		   (property)	
		b.setA(77);
		b.setB(88);
		
		CC c= new CC(a);			//객체값 전달 (constructor-arg ref=a) ref가 붙음			
		c.setBb(b);					// setb 값전달 (property ref=b)ref가 붙음				
		c.disp();					
		
		
		
		System.out.println("--------------------------------------");
		
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		CC cc = (CC) ctx.getBean("c");
		cc.disp();
		
		ctx.close();
	}

}
