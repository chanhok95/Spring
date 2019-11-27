package com.java.guest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.java.guest.service.GuestService;

public class GuestController extends MultiActionController{

	private GuestService guestService;
	
	public GuestController() {}
	
	
	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}




	public GuestController(GuestService guestService) {
		this.guestService = guestService;
	}






	public void guestWrite(HttpServletRequest request,HttpServletResponse response) {
	
		System.out.println("5");
		
		
	}
	
	public void Write(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("잘됨");
	}
	
	
}
