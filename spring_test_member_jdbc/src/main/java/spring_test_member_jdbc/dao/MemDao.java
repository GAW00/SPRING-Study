package spring_test_member_jdbc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import spring_test_member_jdbc.dto.MemDto;
import spring_test_member_jdbc.util.Constant;

public class MemDao {
	JdbcTemplate template = null;
	
	public MemDao() {
		template = Constant.template;
	}
	
	public int login(String id, String pw) {
		int re = -1;
		String sql = "select mem_pwd from mvc_member "
				+ "where mem_uid = " + id;
		String mem_pwd = "";
		mem_pwd = template.queryForObject(sql, new BeanPropertyRowMapper<MemDto>(MemDto.class)).getPwd();

		if(mem_pwd.equals(pw)) re = 1;
		else re = 0;
		return re;
	}
}
