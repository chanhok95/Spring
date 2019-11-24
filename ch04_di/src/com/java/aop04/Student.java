package com.java.aop04;

import java.util.Scanner;

public class Student implements Person {

	@Override
	public void work() {

		System.out.println("수업을 듣는다.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요.");
		int su =sc.nextInt();
		
		if(su==5) System.out.println(su/0);
		sc.close();
	}

}
