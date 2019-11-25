package com.java.board.dao;

import java.util.Map;

import com.java.board.dto.BoardDto;

public interface BoardDao {
	
	public int groupNumberMax();
	public int boardWriteOk(BoardDto boardDto);
	public int boardWriteNumber(Map<String, Integer> map);
}
