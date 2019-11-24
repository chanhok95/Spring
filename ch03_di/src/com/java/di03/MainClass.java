package com.java.di03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA a = new AA(10,20);		//AA�� �����ڸ� ���ؼ� ������  (constructor-arg)
		BB b = new BB();			//BB�� set���� ���� 		   (property)	
		b.setA(77);
		b.setB(88);
		
		CC c= new CC(a);			//��ü�� ���� (constructor-arg ref=a) ref�� ����			
		c.setBb(b);					// setb ������ (property ref=b)ref�� ����				
		c.disp();					
		
		
		
		System.out.println("--------------------------------------");
		
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		CC cc = (CC) ctx.getBean("c");
		cc.disp();
		
		ctx.close();
	}

}
