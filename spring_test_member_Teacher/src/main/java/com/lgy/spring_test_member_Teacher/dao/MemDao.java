package com.lgy.spring_test_member_Teacher.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemDao {
	DataSource dataSource;
	
	public MemDao() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int loginYn(String id, String pw) {
		int re = -1;
		String db_mem_pwd;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataSource.getConnection();
			String sql = "select mem_pwd from mvc_member "
					   + "where mem_uid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				db_mem_pwd = rs.getString("mem_pwd");

//				데이터 베이스 조회된 비밀버호 = 파라미터 비밀번호
				if (db_mem_pwd.equals(pw)) {
					re = 1;
//				데이터 베이스 조회된 비밀번호 != 파라미터 비밀번호 
				} else {
					re = 0;
				}
			}
//			아이디 자체가 없음
			else {
				re = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return re;
	}
}

//insert into mvc_member values('aaa', 'aaa', 'aaa');
//
//create table mvc_member(
//    mem_uid varchar2(15),
//    mem_pwd varchar2(15),
//    mem_name varchar2(10)
//);