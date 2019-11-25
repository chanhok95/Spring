package com.java.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.java.dto.FriendDto;

public class FriendDaoImp implements FriendDao {
	//확장 가능성이 있으면 interface기반으로 
	
	private SqlSessionTemplate sqlSessionTemplate;

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

	@Override
	public int insert(FriendDto friendDto) {
		// TODO Auto-generated method stub
		
		
		return sqlSessionTemplate.insert("friendInsert",friendDto);
		
		
		
	}

	@Override
	public List<FriendDto> getList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("friendList");
	}

	@Override
	public FriendDto select(int num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("friendSelect",num);
	}

	@Override
	public int delete(FriendDto friendDto) {
		// TODO Auto-generated method stub
		
		return sqlSessionTemplate.delete("friendDelete",friendDto);
	}

	@Override
	public int update(FriendDto friendDto) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("friendUpdate",friendDto);
	}

	


	
}
