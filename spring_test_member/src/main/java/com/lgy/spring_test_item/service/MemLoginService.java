package com.lgy.spring_test_item.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.spring_test_item.dao.MemDao;

public class MemLoginService implements MemService{
	@Override
	public boolean execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request =  (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemDao dao = new MemDao();
		
		if(dao.login(id, pw)) return true;
		else return false;
	}
}
