package com.java.guest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.java.aop.LogAspect;
import com.java.guest.dto.GuestDto;
import com.java.guest.service.GuestService;

public class GuestController extends MultiActionController{

	private GuestService guestService;

	public GuestController() {}
	
	public GuestController(GuestService guestService) {
		this.guestService = guestService;
	}

	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}
	
	public ModelAndView guestWrite(HttpServletRequest request,HttpServletResponse response) {
		LogAspect.logger.info(LogAspect.logMsg+"ok");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		
		guestService.guestWrite(mav);
		
		
		
		return mav;
	}
	
	public ModelAndView guestWriteOk(HttpServletRequest request,HttpServletResponse response,GuestDto guestDto) {
		LogAspect.logger.info(LogAspect.logMsg+guestDto.toString()); //Dto 에서 값이 name,password,message는 값이 제대로 넘어와야되는데 name ,password는 null이떳다
																		// Dto와 write.jsp이름이 같은지 무조건 확인하고 다시 값이 제대로 찍히는지 확인하고 넘어가야됨 안그러면 다음작업시 NullpointerException
		ModelAndView mav = new ModelAndView();
//		mav.addObject("request",request);
		mav.addObject("guestDto",guestDto);
		
		guestService.getWrite(mav);
		return mav;
	}
	
	public ModelAndView guestUpdate(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("request",request);
		
		guestService.guestUpdate(mav);
		
		
		
		return mav;
	}
	
	public ModelAndView guestUpdateOk(HttpServletRequest request,HttpServletResponse response,GuestDto guestDto) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("request",request);
		mav.addObject("guestDto",guestDto);
		
		guestService.UpdateOk(mav);
		
		return mav;
	}
	
	public ModelAndView guestDelete(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("request",request);
	
		guestService.delete(mav);
		
		return mav;
	}
	
	
	
}
