package com.java.aop05;

import java.util.Scanner;

public class Student implements Person {

	@Override
	public void work() {

		System.out.println("수업을 듣는다.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("지각여부(5).");
		int su =sc.nextInt();
		
		if(su==5) System.out.println(su/0);
		sc.close();
	}

}
