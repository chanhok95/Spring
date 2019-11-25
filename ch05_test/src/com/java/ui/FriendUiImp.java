package com.java.ui;

import java.util.List;
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
		
		while(true) {
		System.out.println("\n선택하세요 : ");
		
		int choice = sc.nextInt();
		
		
		switch(choice) {
		
		case 1:	input();
			break ;
			
		case 2:guestList();
			break ;
			
		case 3:select();
			break ;
			
		case 4:update();
			break ;
			
		case 5:delete();
			break ;

		case 6:
			System.out.println("종료합니다");
			System.exit(0);
			if(sc!=null)sc.close();
		default:
			System.out.println("입력번호를 확인하세요.");
			break;
			}
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
		
		
//		sc.close();  java.util.NoSuchElementException뜨는 이유 자원반납을하면 다시 해당함수에 돌아가서 실행이안되 이런 현상을 방지하기 위해 .next()는 while 루프 내에서 한 번만 나와야 한다
	}
	
	public void guestList() {
		List<FriendDto> friendList = friendDao.getList();
		MyAspect.logger.info(MyAspect.logMsg+friendList.size());
		
		for(int i=0; i<friendList.size(); i++) {
			FriendDto friendDto = friendList.get(i);
			System.out.println(friendDto.toString());
		}
	}
	
	public void select() {
		Scanner sc = new Scanner(System.in); //전역으로 빼는게좋음 Scanner를 게속쓰니까
		
		System.out.println("친구번호:");
		int num = sc.nextInt();
		
		friendDto=friendDao.select(num);
		
		if(friendDto !=null) {
			MyAspect.logger.info(MyAspect.logMsg+friendDto.toString());
			
		}
		
	}
	public void delete() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("친구번호:");
		int num = sc.nextInt();
		
		friendDto=friendDao.select(num);
		if(friendDto != null) {
			
			int check = friendDao.delete(friendDto);
		}else {
			System.out.println("친구가 존재하지않습니다");
		}
	}
	//int check = friendDao.insert(friendDto);
	
	// if(check > 0) System.out.println("input Success");
	
	
	public void update() {
	Scanner sc= new Scanner(System.in);
		
		System.out.println("수정할번호를 입력하세요:");
		int num = sc.nextInt();
		friendDto=friendDao.select(num);
		System.out.println("수정될이름을 적어주세요. ");
		friendDto.setName(sc.next());
		
		System.out.println("수정될전화번호를 적어주세요.");
		friendDto.setPhone(sc.next());
		
		
		
		if(friendDto != null) {
			//수정
			int check = friendDao.update(friendDto);
		}else {
			System.out.println("친구가 존재하지않습니다");
		}
	}
	

	public void showMenu() {
		
		System.out.println("----------------------");
		System.out.println("1. 주소록 작성");
		System.out.println("2. 주소록 전체출력");
		System.out.println("3. 주소록 검색");
		System.out.println("4. 주소록 수정");
		System.out.println("5. 주소록 삭제");
		System.out.println("6. 종료");
	}

	
}
