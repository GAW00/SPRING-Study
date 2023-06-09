package com.lgy.spring_test_item_jdbc.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.lgy.spring_test_item_jdbc.dao.*;
import com.lgy.spring_test_item_jdbc.dto.*;

public class ItemContentService implements ItemService{
	@Override
	public void execute(Model model) {
		ItemDao dao = new ItemDao();
		ArrayList<ItemDto> dtos = dao.contentView();
		model.addAttribute("content_view", dtos);
	}
}
