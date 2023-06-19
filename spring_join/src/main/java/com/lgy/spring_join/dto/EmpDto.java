package com.lgy.spring_join.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpDto {
//	조인시 필요한 컬럼 외에도 나머지 컬럼들도 다 가져옴(차후 쿼리 추가나 변경 고려)
	private int deptno; 
	private String dname; 
	private String loc;
}
