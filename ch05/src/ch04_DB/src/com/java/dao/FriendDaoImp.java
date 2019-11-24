package com.java.dao;

import org.mybatis.spring.SqlSessionTemplate;

public class FriendDaoImp implements FriendDao {
	//확장 가능성이 있으면 interface기반으로 
	
	private SqlSessionTemplate sqlSessionTemplate ;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public FriendDaoImp(SqlSessionTemplate sqlSessionTemplate) {

		this.sqlSessionTemplate = sqlSessionTemplate;	//SqlSessionFactory, Session
	}
	
	public FriendDaoImp() {}

	@Override
	public String toString() {
		return "FriendDaoImp [sqlSessionTemplate=" + sqlSessionTemplate + "]";
	}
	
}
