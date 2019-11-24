package com.java.aop06;

import java.util.Random;

public class Man implements Person {

	@Override
	public String doSomething() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터로 게임을 한다.");
		
		boolean check = new Random().nextBoolean();
		
		if(check) {
			throw new Exception("화재발생");
		}
		
		
		return "나는 남자야";
	}

}
