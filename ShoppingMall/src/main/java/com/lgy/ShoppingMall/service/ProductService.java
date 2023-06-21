package com.lgy.ShoppingMall.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgy.ShoppingMall.dto.CategoryDto;
import com.lgy.ShoppingMall.dto.ProductDto;

public interface ProductService {
		//카테고리
		public ArrayList<CategoryDto> category();
		
		// 상품등록
		public void register(HashMap<String, String> param);
		
		//상품목록
		public ArrayList<ProductDto> productlist();
		
		//상품조회 + 카테고리 조인
		public ProductDto productView (HashMap<String, String> param);
		
		//상품 수정
		public void productModify(HashMap<String, String> param);
		
		//상품 삭제
		public void productDelete(HashMap<String, String> param);
}
