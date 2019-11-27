package com.java.guest.service;

import org.springframework.web.servlet.ModelAndView;

public interface GuestService {
	public void guestWrite(ModelAndView mav);
	public void getWrite(ModelAndView mav);
	public void guestUpdate(ModelAndView mav);
	public void UpdateOk(ModelAndView mav);
	public void delete(ModelAndView mav);
}
