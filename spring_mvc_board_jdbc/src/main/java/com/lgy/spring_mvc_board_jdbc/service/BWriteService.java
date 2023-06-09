package com.lgy.spring_mvc_board_jdbc.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.spring_mvc_board_jdbc.dao.*;

public class BWriteService implements BService{
	@Override
	public void execute(Model model) {
//		Dao 에 있는 String bname, String btitle, String bcontent 값들이 필요
//		model 객체에서 꺼내서 전송
		Map<String, Object> map = model.asMap();
//		request : 컨트롤단에서 보내주는 이름
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BDao dao = new BDao();
		// dao 단 호출
		dao.write(bname, btitle, bcontent);
	}
}
