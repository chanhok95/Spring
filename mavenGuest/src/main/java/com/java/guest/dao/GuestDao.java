package com.java.guest.dao;

import java.util.List;

import com.java.guest.dto.GuestDto;

public interface GuestDao {
	public int insert(GuestDto guestDto); 
	public int getCount();
	public List<GuestDto>guestList(int starRow,int endRow);
	public GuestDto guestUpdate(int num);
	public int updateOk(GuestDto guestDto);
	public int delete(int num);
}
