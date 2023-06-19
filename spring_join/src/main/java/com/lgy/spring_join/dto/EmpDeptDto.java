package com.lgy.spring_join.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpDeptDto {
//	조인시 필요한 컬럼 외에도 나머지 컬럼들도 다 가져옴(차후 쿼리 추가나 변경 고려)
	조인을 
//	emp table
	private int empno; 
	private String ebanem; 
	private String job; 
	private int mgr; 
	private Timestamp hiredate; 
	private int sal;
	private int comm; 
	private int deptno; 
	
//	dept table
	private int deptno; 
	private String dname; 
	private String loc;
}
