package com.lgy.spring_test_member_jdbc_Teacher.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.lgy.spring_test_member_jdbc_Teacher.dto.MemDto;
import com.lgy.spring_test_member_jdbc_Teacher.util.Constant;

public class MemDao {
	JdbcTemplate template = null;
	
	public MemDao() {
		template = Constant.template;
	}
	
	public ArrayList<MemDto> loginYn(String id, String pw) {
//		기존 BID 를 where 조건절로 받을 때는 BID가 number타입이기에 작은 따옴표가 필요 없다
//		여기선 mem_uid 가 varchar2 차입이기에 작은 따옴표 없으면 오류
		String sql = "select mem_pwd from mvc_member where mem_uid = '" + id + "'";
//				   + "where mem_uid = " + id;
//				   + "where mem_uid = '" + id + "'";
		return (ArrayList<MemDto>) template.query(sql, new BeanPropertyRowMapper(MemDto.class));
	}
	
	public void write(final String mem_uid, final String mem_pwd, final String mem_name) {
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into mvc_member "
						   + "values(?, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, mem_uid);
				pstmt.setString(2, mem_pwd);
				pstmt.setString(3, mem_name);
				
				return pstmt;
			}
		});
	}
}
