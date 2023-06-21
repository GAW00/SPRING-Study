package com.lgy.ShoppingMall.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	 private int proCode; //상품번호
	 private int cateCode; //카테고리 코드
	 private String proName; //상품이름
	 private String proPrice; //상품가격
	 private String proSale; //상품세일가
	 private String proInfo; //상품정보
	 private String proYN; //판매여부
	 private int proQty; //판매수량
	 private String proThumb; //상품썸네일
	 private String proImg;	 // 상품상세이미지
}
//"PROCODE"	NUMBER(20)		NOT NULL,
//"CATECODE"	NUMBER(20)		NOT NULL,
//"PRONAME"	VARCHAR2(30)		NULL,
//"PROPRICE"	VARCHAR2(30)		NULL,
//"PROSALE"	VARCHAR2(30)		NULL,
//"PROINFO"	VARCHAR2(500)		NULL,
//"PROYN"	VARCHAR2(10)	DEFAULT 'Y'	NULL,
//"PROQTY"	NUMBER(30, 0)		NULL,
//"PROTHUMB"	VARCHAR2(500)		NULL,
//"PROIMG"	VARCHAR2(500)		NULL