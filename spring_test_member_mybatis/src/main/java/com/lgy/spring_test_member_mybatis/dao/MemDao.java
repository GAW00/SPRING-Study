package com.lgy.spring_test_member_mybatis.dao;

import java.util.ArrayList;

import com.lgy.spring_test_member_mybatis.dto.MemDto;

public interface MemDao {
	public ArrayList<MemDto> loginYn(String id, String pw);
	public void write(String mem_uid, String mem_pwd, String mem_name);
}
