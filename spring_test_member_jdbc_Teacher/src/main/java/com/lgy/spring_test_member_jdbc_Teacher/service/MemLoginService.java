package com.lgy.spring_test_member_jdbc_Teacher.service;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.spring_test_member_jdbc_Teacher.dao.*;
import com.lgy.spring_test_member_jdbc_Teacher.dto.MemDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemLoginService implements MemService{
	@Override
	public int execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("mem_uid");
		System.out.println("@@@### mem_uid = " + id);
		String pw = request.getParameter("mem_pwd");
		System.out.println("@@@### mem_pwd = " + pw);
		
		int re;
		MemDao dao = new MemDao();
		
		ArrayList<MemDto> dtos = dao.loginYn(id, pw);
		
		if(dtos.isEmpty()) { // 조회가 안된 경우
			re = -1;
		}
		else {
			log.info("@@## : " + pw + ", " + dtos.get(0).getMem_pwd());
			if(pw.equals(dtos.get(0).getMem_pwd())) {
				re = 1;
			}
			else {
				re = 0;
			}
		}
		System.out.println("@@@### re = " + re);
		return re;
	}
}
