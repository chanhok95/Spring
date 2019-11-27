package com.java.guest.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.java.aop.LogAspect;
import com.java.guest.dao.GuestDao;
import com.java.guest.dto.GuestDto;

public class GuestServiceImp implements GuestService {

	private GuestDao guestDao;
	
	
	
	public GuestServiceImp() {}
	
	public void setGuestDao(GuestDao guestDao) {
		this.guestDao = guestDao;
	}




	public GuestServiceImp(GuestDao guestDao) {
		this.guestDao = guestDao;
	}




	@Override
	public void guestWrite(ModelAndView mav) {
		// TODO Auto-generated method stub
		Map<String,Object>map = mav.getModelMap();
		
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String pageNumber= request.getParameter("pageNumber");
		if(pageNumber ==null) pageNumber="1";
		
		int currentPage = Integer.parseInt(pageNumber); // 1) 요청페이지 1
		
		
		int boardSize = 3; // 2) 페이지당 출력할 게시물 수
		
		int starRow=(currentPage-1)*boardSize+1; 		//시작번호
		int endRow= boardSize*currentPage; 				//끝번호
		
		int count = guestDao.getCount(); //"select count(*) from guest"
		LogAspect.logger.info(LogAspect.logMsg+count);
		
		List<GuestDto> guestList =null;
		
		if(count > 0) {		//  위에서 실행된 count 값이 한개이상 들어오면 밑의값 실행
		guestList = guestDao.guestList(starRow,endRow);
		LogAspect.logger.info(LogAspect.logMsg+guestList.size());
		}
		
		request.setAttribute("guestList", guestList);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("boardSize", boardSize);
		request.setAttribute("count", count);
		
		
		mav.addObject(request); //Controller에서 게속 보내줘서 안써도됨
		mav.setViewName("guest/write");
	}
	
	@Override
	public void getWrite(ModelAndView mav) {
		// TODO Auto-generated method stub
		Map<String,Object>map = mav.getModelMap();
		GuestDto guestDto= (GuestDto) map.get("guestDto");
		
		guestDto.setWriteDate(new Date());
		guestDto.setMessage(guestDto.getMessage().replace("\r\n", "<br/>"));
		
		int check = guestDao.insert(guestDto);
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		mav.addObject("check",check);
		mav.setViewName("guest/writeOk");
	}

	@Override
	public void guestUpdate(ModelAndView mav) {
		// TODO Auto-generated method stub
		Map<String,Object>map = mav.getModel();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		int num =Integer.parseInt(request.getParameter("num"));
		int pageNumber=Integer.parseInt(request.getParameter("pageNumber"));
		
		LogAspect.logger.info(LogAspect.logMsg+num+","+pageNumber);
		GuestDto guestDto=guestDao.guestUpdate(num);
		
		LogAspect.logger.info(LogAspect.logMsg+guestDto.toString());
		
		request.setAttribute("guestDto", guestDto);
		request.setAttribute("pageNumber", pageNumber);
		
		mav.setViewName("guest/update");
	}

	@Override
	public void UpdateOk(ModelAndView mav) {
		// TODO Auto-generated method stub
		GuestDto guestDto=new GuestDto();
		Map<String, Object>map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		guestDto.setNum(Integer.parseInt(request.getParameter("num")));
		guestDto.setPassword(request.getParameter("pwd"));
		guestDto.setMessage(request.getParameter("message"));
		
		LogAspect.logger.info(LogAspect.logMsg+guestDto.toString());
		
		int check=guestDao.updateOk(guestDto);
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		int pageNumber=Integer.parseInt(request.getParameter("pageNumber"));
		
		request.setAttribute("check", check);
		request.setAttribute("pageNumber", pageNumber);
		
		mav.setViewName("guest/updateOk");
	}

	@Override
	public void delete(ModelAndView mav) {
		// TODO Auto-generated method stub
		Map<String, Object>map =mav.getModelMap();
		
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int num= Integer.parseInt(request.getParameter("num"));
		int pageNumber = Integer.parseInt(request.getParameter("pageNumber")); // 임의의 페이지를삭제했을때 1페이지로 다시 안가게끔  ,view (hidden)

		LogAspect.logger.info(LogAspect.logMsg+"num -> "+num +"\t"+"pageNumber ->"+pageNumber);
		int check = guestDao.delete(num);
		
		LogAspect.logger.info(LogAspect.logMsg+check);
			
		
		request.setAttribute("check", check);
		request.setAttribute("pageNumber", pageNumber);
		
		mav.setViewName("guest/delete");
	}	

}
