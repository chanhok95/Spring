package com.java.aop06;

import java.util.Random;

public class Woman implements Person{

	@Override
	public String doSomething() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("드라마를 본다.");
		
		boolean check = new Random().nextBoolean();
		
		if(check) {
			throw new Exception("화재발생");
		}
		
		
		return "나는 여자야";
	}


}
