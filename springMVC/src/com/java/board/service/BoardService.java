package com.java.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface BoardService {
//	public void boardWrite(HttpServletRequest request,HttpServletResponse response);
	public void boardWrite(ModelAndView mav);
	public void boardWriteOk(ModelAndView mav);

}
