package com.lgy.spring_test_item_mybatis.dao;

import java.util.ArrayList;

public interface ItemDao {
	public void write(final String name, final int price, final String description);
	public ArrayList<com.lgy.spring_test_item_mybatis.dto.ItemDto> contentView();
}
