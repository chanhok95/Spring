package com.java.exe;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.java.ui.FriendUI;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		FriendUI friendUi = (FriendUI) ctx.getBean("friendUiImp");
		friendUi.execute();
		
		ctx.close();
	}

}
