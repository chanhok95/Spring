package com.java.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	//Ŭ������ ������ �������� �������� �������� �ڵ� �����ؾ��ϴ� ������ �о�����.
	//Ŭ������ ���յ� ���ϰ� �������� �����ؾ��Ѵ�.
		
		Su su=new Su();
		su.disp();
		
	//DI(Dependency Injection) : �������� ���� ���� ���� / �ܺηκ��� ���޹޴´�. (���������� �̱���)	
	
	
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
	
	Su appSu=(Su) ctx.getBean("su");
	appSu.disp();
	
	
	
	ctx.close();
	
	}
}
