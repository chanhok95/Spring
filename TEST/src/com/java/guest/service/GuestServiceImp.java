package com.java.guest.service;

import com.java.guest.dao.GuestDao;

public class GuestServiceImp implements GuestService {

	
	private GuestDao guestDao;

	public GuestServiceImp() {};
	
	public GuestServiceImp(GuestDao guestDao) {
		this.guestDao = guestDao;
	}


	
	public void setGuestDao(GuestDao guestDao) {
		this.guestDao = guestDao;
	}
	
	
}
