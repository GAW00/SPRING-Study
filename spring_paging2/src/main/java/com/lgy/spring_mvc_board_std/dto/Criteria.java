package com.lgy.spring_mvc_board_std.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
// @NoArgsConstructor
public class Criteria {
	private int pageNum; // 페이지 번호
	private int amount;  // 페이지당 게시글 개수
	
	public Criteria() {
//		초기 페이지는 1이고, 10개씩 출력
		this(1, 10);
	}
}
