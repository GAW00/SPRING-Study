package com.lgy.spring_test_member_jdbc_Teacher.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.spring_test_member_jdbc_Teacher.dao.MemDao;

public class MWriteService implements MemService{
	@Override
	public int execute(Model model) {
		Map<String, Object> map = model.asMap();
//		request : 컨트롤단에서 보내주는 이름
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
//		MemDto 의 값들
		String mem_uid = request.getParameter("mem_uid");
		String mem_pwd = request.getParameter("mem_pwd");
		String mem_name = request.getParameter("mem_name");
		
		MemDao dao = new MemDao();
		// dao 단 호출
		dao.write(mem_uid, mem_pwd, mem_name);
		
		return 0;
	}
}
