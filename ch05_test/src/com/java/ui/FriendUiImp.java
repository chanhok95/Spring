package com.java.ui;

import java.util.Scanner;

import com.java.aop.MyAspect;
import com.java.dao.FriendDao;
import com.java.dto.FriendDto;

public class FriendUiImp implements FriendUI {
	private FriendDao friendDao;
	private FriendDto friendDto;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		showMenu();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n선택하세여 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:	input();
			break ;
			
		case 2:
			break ;
			
		case 3:
			break ;
			
		case 4:
			break ;
			
		case 5:
			break ;
			
		default:
			break ;
		
		}
		
	}

	
	public FriendUiImp() {}
	
	


	public void setFriendDao(FriendDao friendDao) {
		this.friendDao = friendDao;
	}


	public FriendUiImp(FriendDto friendDto) {

		this.friendDto = friendDto;
	}

	public void setFriendDto(FriendDto friendDto) {
		this.friendDto = friendDto;
	}

	private void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 ");
		friendDto.setName(sc.next());
		
		System.out.println("전화번호");
		friendDto.setPhone(sc.next());
		
		MyAspect.logger.info(MyAspect.logMsg + friendDto.toString());
		
		int check = friendDao.insert(friendDto);
		
		if(check > 0) System.out.println("input Success");
		
		
		sc.close();
	}

	public void showMenu() {
		
		System.out.println("----------------------");
		System.out.println("1. 주소록 작성");
		System.out.println("2. 주소록 전체출력");
		System.out.println("3. 주소록 검색");
		System.out.println("4. 주소록 수정");
		System.out.println("5. 주소록 삭제");
		
	}

}
