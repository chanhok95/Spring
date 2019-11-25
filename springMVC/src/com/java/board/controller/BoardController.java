package com.java.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.InternalResourceView;

import com.java.board.dto.BoardDto;
import com.java.board.service.BoardService;


/**
 * 작성자:길찬호
 * 날짜:2019. 11. 25.
 * 설명			각각의 구역으로 나뉘어서 제공
 * 	MVC:FrontCotroller --설정(~.properties)    -DispatcherServlet
 * 						 Map				  - SimpleUrlHandlerMapping
 * 												:웹 요청시 URL과 컨트롤러의 맵핑을 일괄정의
 * 						 요청  Command(주소 - CLASS) - MultiActionController(주소/함수)
 * 						 Command-view Page
 * 					     RequestDispatcher forward 사용해서 result view  - InternalResourceViewResolver
 */
public class BoardController extends MultiActionController{
		//MultiActionController -> 특정 파라미터의 값이나 URL 등을 이용해여 해당 클래스의 메소드를 실행시킴.
		
	private BoardService boardService;
		
	public  BoardController() {}	
	
	public BoardController(BoardService boardService) {	
			this.boardService = boardService;
	}
	
	

	public void setBoardService(BoardService boardService) {		
		this.boardService = boardService;
	}

	public ModelAndView Example(HttpServletRequest request,HttpServletResponse response) {			//두가지방법 중 하나 밑에거 걸리니까 Example로 만들어서 안쓰게만둠
		
//		boardService.boardWrite(request,response);
	
		View view = new InternalResourceView("/WEB-INF/views/board/write.jsp");	//전에는 String으로 전달이 됬지만 여기서는 이과정들로
	
		ModelAndView mav = new ModelAndView();
		mav.addObject(request);
		mav.setView(view);
	
		return mav;
		
	}
	
	
public ModelAndView boardWrite(HttpServletRequest request,HttpServletResponse response) {
	
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("response",response);
		
		
		boardService.boardWrite(mav);

		return mav;
	
		
	}
	
	
	
	public ModelAndView writeOk(HttpServletRequest request,HttpServletResponse response,BoardDto boardDto) {
		ModelAndView mav = new ModelAndView();	// ModelAndView : 데이터를 전송시킬 수 있는 리턴 타입
		mav.addObject("request",request);
		mav.addObject("response",response);
		mav.addObject("boardDto",boardDto); //addObject : key와 value를 담아 보낼 수 있는 메서드
		
											//setViewName : 어떤 페이지를 보여줄 것인지
		boardService.boardWriteOk(mav);
	
		return mav;
		
	}
	
	
	public void boardList(HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("L");
		
		
	}
	
	
}
