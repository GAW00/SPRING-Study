package com.lgy.spring_join.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_join.dto.DeptDto;
import com.lgy.spring_join.dto.EmpDeptDto;
import com.lgy.spring_join.dto.EmpDto;
import com.lgy.spring_join.dto.EmpJoinDeptDto;
import com.lgy.spring_join.service.EmpInfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EmpInfoController {
	@Autowired
	private EmpInfoService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		log.info("@# EmpInfoController.list()");
		
//		ArrayList<EmpDeptDto> list = service.list();
		ArrayList<EmpJoinDeptDto> list = service.list();
		log.info("@# list =>"+list);
		log.info("@# list getEmps =>"+list.get(0).getEmps());
		log.info("@# list getDepts =>"+list.get(0).getDepts());
		
		ArrayList<EmpDto> empDtos = list.get(0).getEmps();
		ArrayList<DeptDto> deptDtos = list.get(0).getDepts();
		
		model.addAttribute("list", list);
		model.addAttribute("list_emp", empDtos);
		model.addAttribute("list_dept", deptDtos);
		
		return "list";
	}
}
















