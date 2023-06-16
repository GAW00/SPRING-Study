package com.lgy.ShoppingMall.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* ======================================================
ProudctDto
상품 정보를 나타내는 dto
  개발자   |   수정자   |    개발 및 수정 일자    |    수정 내용
  박동명                      23-06-16            
====================================================== */ 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	private String procode;
	private String catecode;
	private String proname;
	private String proprice;
	private String proinfo;
//	private String prothumb;
//	private String proimg;
}
