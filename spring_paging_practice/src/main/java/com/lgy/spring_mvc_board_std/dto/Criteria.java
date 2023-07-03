package com.lgy.spring_mvc_board_std.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Criteria {
	private int pageNum; // 페이지 번호
	private int amount;  // 페이지당 게시글 수
	
	public Criteria() {
//		this(1, 10);
		this(5, 10);
	}
}
