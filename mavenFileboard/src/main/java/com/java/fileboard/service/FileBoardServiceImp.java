package com.java.fileboard.service;

import org.springframework.web.servlet.ModelAndView;

public class FileBoardServiceImp implements FileBoardService {

	@Override
	public void fileWrite(ModelAndView mav) {
		// TODO Auto-generated method stub
		mav.setViewName("fileboard/write");
	}

}
