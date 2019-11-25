package com.java.dao;

import java.util.List;

import com.java.dto.FriendDto;

public interface FriendDao {

	
	public int insert(FriendDto friendDto);
	
	public List<FriendDto> getList();
	
	public FriendDto select(int num);

//	public FriendDto update(int num);

	public int delete(FriendDto friendDto);
	
	public int update(FriendDto friendDto);
}
