package com.java.board.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.java.board.dto.BoardDto;

public class BoardDaoImp implements BoardDao {

	private SqlSessionTemplate sqlSession;
	
	public BoardDaoImp() {}

	public BoardDaoImp(SqlSessionTemplate sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int groupNumberMax() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardGroupNumberMax");
	}

	@Override
	public int boardWriteOk(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("dao.BoardMapper.boardInsert",boardDto); //namespace로 써도됨
	}

	@Override
	public int boardWriteNumber(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return sqlSession.update("dao.BoardMapper.boardWriteNumber",map);
	}


	
	
	
	
}
