package com.java.board.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.java.aop.LogAspect;
import com.java.board.dao.BoardDao;
import com.java.board.dto.BoardDto;


public class BoardServiceImp implements BoardService {

	private BoardDao boardDao;
	
	
	public BoardServiceImp() {}
	
	public BoardServiceImp(BoardDao boardDao) {
		super();
		this.boardDao = boardDao;
	}


	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	
	@Override
	public void boardWrite(ModelAndView mav) {
		// TODO Auto-generated method stub
		// 부모글 ROOT
				int boardNumber =0;		//글번호(DB 결정)
				int groupNumber =1;		//그룹번호
				int sequenceNumber=0;	//글순서
				int sequenceLevel=0;	//글레벨
				
				
			Map<String,Object> map = mav.getModelMap();
			HttpServletRequest request = (HttpServletRequest) map.get("request");
				
				if(request.getParameter("boardNumber") != null) {
					// 답글 
					boardNumber=Integer.parseInt(request.getParameter("boardNumber"));
					groupNumber=Integer.parseInt(request.getParameter("groupNumber"));
					sequenceNumber=Integer.parseInt(request.getParameter("sequenceNumber"));
					sequenceLevel=Integer.parseInt(request.getParameter("sequenceLevel"));
					
				}
//				System.out.println(boardNumber);
//				System.out.println(groupNumber);
//				System.out.println(sequenceNumber);
//				System.out.println(sequenceLevel);
//				
				request.setAttribute("boardNumber", boardNumber);
				request.setAttribute("groupNumber", groupNumber);
				request.setAttribute("sequenceNumber", sequenceNumber);
				request.setAttribute("sequenceLevel", sequenceLevel);		//4개의값 히든
				
				mav.setViewName("board/write");
			//	return "/WEB-INF/views/board/write.jsp"; 
	}

	@Override
	public void boardWriteOk(ModelAndView mav) {
		Map<String,Object>map= mav.getModelMap();
		
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		BoardDto boardDto=(BoardDto) map.get("boardDto");
		System.out.println(boardDto.toString());
		LogAspect.logger.info(LogAspect.logmsg+boardDto.toString());
		
		boardWriteNumber(boardDto);
		
		
		boardDto.setWriteDate(new Date());
		boardDto.setReadCount(0);
		
		 int check = boardDao.boardWriteOk(boardDto);
		LogAspect.logger.info(LogAspect.logmsg+check);
		
		mav.addObject("check",check);
		mav.setViewName("board/writeOk");
	
		
	}
		
	

	public void boardWriteNumber(BoardDto boardDto) {
		// TODO Auto-generated method stub
		int boardNumber = boardDto.getBoardNumber(); // 0
		int groupNumber = boardDto.getGroupNumber(); // 1
		int sequenceNumber = boardDto.getSequenceNumber(); // 0
		int sequenceLevel = boardDto.getSequenceLevel(); // 0
		
		if (boardNumber == 0) { // Root-그룹번호
			int max= boardDao.groupNumberMax();
			LogAspect.logger.info(LogAspect.logmsg+max);
			
			if(max !=0 ) boardDto.setGroupNumber(max+1);
		}else {    //답글 - 글레벨 ,글순서	
			Map<String,Integer> map = new HashMap<String, Integer>();
			map.put("groupNumber",groupNumber);
			map.put("sequenceNumber",sequenceNumber);
			
			int check = boardDao.boardWriteNumber(map);
			LogAspect.logger.info(LogAspect.logmsg+check);
			
			
			boardDto.setSequenceNumber(sequenceNumber+1);
			boardDto.setSequenceLevel(sequenceLevel+1);
			
		}

	}
		
}



