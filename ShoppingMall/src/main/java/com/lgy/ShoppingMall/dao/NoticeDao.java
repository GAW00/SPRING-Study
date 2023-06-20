package com.lgy.ShoppingMall.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgy.ShoppingMall.dto.*;

public interface NoticeDao {
    public ArrayList<NoticeDto> list();

    public void write(HashMap<String, String> param);

    public NoticeDto contentView(HashMap<String, String> param);

    public void modify(HashMap<String, String> param);

    public void delete(HashMap<String, String> param);
}
