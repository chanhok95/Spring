package com.java.guest.dao;

import org.mybatis.spring.SqlSessionTemplate;

public class GuestDaoImp implements GuestDao {

	private SqlSessionTemplate sqlSession;

	public GuestDaoImp() {}
	
	public GuestDaoImp(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
	
	
}
