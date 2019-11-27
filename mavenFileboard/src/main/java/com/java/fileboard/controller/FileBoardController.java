package com.java.fileboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.java.fileboard.service.FileBoardService;

public class FileBoardController extends MultiActionController {

	private FileBoardService fileBoardService;
	
	public FileBoardController() {};
	
	
	
	public FileBoardController(FileBoardService fileBoardService) {
		super();
		this.fileBoardService = fileBoardService;
	}



	


	public void setFileBoardService(FileBoardService fileBoardService) {
		this.fileBoardService = fileBoardService;
	}






	public ModelAndView fileBoardWrite(HttpServletRequest request , HttpServletResponse response) {
		System.out.println("OK");
		ModelAndView mav = new ModelAndView();
		fileBoardService.fileWrite(mav);
		
		return mav;
	}
	
}
