package com.lgy.spring_join.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptDto {
//	단일 테이블 컬럼 Dto 도 조인 Dto에 비해서 상대적으로 사용이 저조함
	private int deptno;
	private String dname;
	private String loc;
}














