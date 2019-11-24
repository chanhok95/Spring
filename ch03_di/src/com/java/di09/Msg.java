package com.java.di09;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Msg implements IMsg, InitializingBean,DisposableBean {

	private int su;
	private int value;
	
	public Msg() {}
	
	
	
	
	
	public Msg(int su, int value) {
		super();
		this.su = su;
		this.value = value;
	}


	

	
	public void setSu(int su) {
		this.su = su;
	}


	public void setValue(int value) {
		this.value = value;
	}

	
	@Override
	public String toString() {
		return "Msg [su=" + su + ", value=" + value + "]";
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//빈 소멸 과정에서 내부적으로 호출
		System.out.println("5-1.destroy()-------------------------");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//빈초기화 내부적으로 호출
		System.out.println("3-2.afterPropertiesSet()----------------------------");
	}





	@Override
	public String toDisp() {
		// TODO Auto-generated method stub
		return "su="+su+",value="+value;
	}
	
	
}
