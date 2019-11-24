package com.java.quiz02;


public class SungjukBan {
 // 출력값이 반총점 :240 반평균: 40.0
//	private String name;
//	private int kor;
//	private int eng;
//	private int math;
//	
//	private float sum;
//	private float avg;
//	
//	public void bandisp() {
//		Scanner sc = new Scanner(System.in);
//	
//		
//		
//		
//	}
//	
//	
	
	private int kor=50;
	private int eng=60;
	private int math=45;
	
	private int sum=0;
	private	float avg=0;
	
	public void bandisp() {
		sum = kor+ eng +math;
		System.out.println("반총점:"+sum);
		avg = sum/3;
		System.out.println("방평균:"+avg);
		
	}



	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	
	
	
}
