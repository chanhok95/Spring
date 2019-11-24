package com.java.quiz01;

import java.util.Scanner;

public class Yonsan {

	private int su = 0;
	private int value = 0;
	private int result = 0;
	private String buho;

	public void disp() {
		System.out.println(su+buho+value+"="+result);
		
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("수를입력하세요");
		su = sc.nextInt();
		sc.nextLine();
		System.out.println("부호를 입력하세요");
		buho = sc.nextLine();
		System.out.println("수를 입력하세요");
		value = sc.nextInt();
	}

	public void getYonsan() {
		if (buho.equals("+")) {
			result = su + value;
		} else if (buho.equals("-")) {
			result = su - value;
//			System.out.println(su - value + result);
		} else if (buho.equals("*")) {
			result = su * value;
		} else if (buho.equals("/")) {
			if(result == 0) {
				System.out.println("0의값");
			}else {
				result =  su / value;
			}
			
			//	result = su / value;
		} else {
			System.out.println("값을 제대로 입력해주세요.");
		}

	}

}
