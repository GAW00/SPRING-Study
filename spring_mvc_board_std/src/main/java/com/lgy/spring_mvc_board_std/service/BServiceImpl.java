package com.lgy.spring_mvc_board_std.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.spring_mvc_board_std.dao.IBDao;
import com.lgy.spring_mvc_board_std.dto.BDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("BService")
public class BServiceImpl implements BService{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<BDto> list() {
		log.info("@# BServiceImpl.list() start");
		
		IBDao dao = sqlSession.getMapper(IBDao.class);
//		model.addAttribute("list", dao.list());
		ArrayList<BDto> list = dao.list();
		
		log.info("@# BServiceImpl.list() end");
		
		return list;
	}

	@Override
	public void write(HashMap<String, String> param) {
		log.info("@# BServiceImpl.write() start");
		
		IBDao dao = sqlSession.getMapper(IBDao.class);
//		dao.write(request.getParameter("bname")
//				, request.getParameter("btitle")
//				, request.getParameter("bcontent"));
		dao.write(param); // param에 다 담겨져 있음
		
		log.info("@# BServiceImpl.write() end");
	}

	@Override
	public BDto contentView(HashMap<String, String> param) {
		log.info("@# BServiceImpl.contentView() start");
		
		IBDao dao = sqlSession.getMapper(IBDao.class);
//		model.addAttribute("content_view", dao.contentView(request.getParameter("bid")));
		BDto dto = dao.contentView(param);
		
		log.info("@# BServiceImpl.contentView() end");
		
		return dto;
	}

	@Override
	public void modify(HashMap<String, String> param) {
		log.info("@# BServiceImpl.modify() start");
		
		IBDao dao = sqlSession.getMapper(IBDao.class);
//		dao.modify(request.getParameter("bid")
//				, request.getParameter("bname")
//				, request.getParameter("btitle")
//				, request.getParameter("bcontent"));
		dao.modify(param);
		
		log.info("@# BServiceImpl.modify() end");
	}

	@Override
	public void delete(HashMap<String, String> param) {
		log.info("@# BServiceImpl.delete() start");
		
		IBDao dao = sqlSession.getMapper(IBDao.class);
//		dao.delete(request.getParameter("bid"));
		dao.delete(param);
		
		log.info("@# BServiceImpl.delete() end");
	}
	
}
