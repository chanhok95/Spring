package com.java.di01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
			AA aa = (AA) ctx.getBean("aa"); //object�� ��ȯ�Ǵϱ� ����ȯ
			System.out.println(aa.toString());
			
			ctx.close();
			
	}

}
