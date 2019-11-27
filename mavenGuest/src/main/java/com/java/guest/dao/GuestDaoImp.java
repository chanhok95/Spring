package com.java.guest.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.java.guest.dto.GuestDto;

public class GuestDaoImp implements GuestDao {
	
	private SqlSessionTemplate sqlSessionTemplate;

	
	public GuestDaoImp() {}
	
	public GuestDaoImp(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public int insert(GuestDto guestDto) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert("dao.guestMapper.guestinsert",guestDto);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("dao.guestMapper.guestCount");
	}

	@Override
	public List<GuestDto> guestList(int starRow, int endRow) {
		// TODO Auto-generated method stub
		Map<String,Integer> hMap = new HashMap<String, Integer>();
		hMap.put("starRow", starRow);
		hMap.put("endRow", endRow);
		
		return sqlSessionTemplate.selectList("dao.guestMapper.guestList",hMap);
	}
	
	@Override
	public GuestDto guestUpdate(int num) {
		// TODO Auto-generated method stub
		
		return sqlSessionTemplate.selectOne("dao.guestMapper.guestselectUp",num);
	}

	@Override
	public int updateOk(GuestDto guestDto) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("dao.guestMapper.guestUpdatesel",guestDto);
	}
	@Override
	public int delete(int num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("dao.guestMapper.guestDelete",num);
	}
	
}
