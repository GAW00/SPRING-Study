package com.lgy.spring_mvc_board_std.dto;

import lombok.Getter;

@Getter
public class PageDTO {
//	페이지 번호가 10개씩 보이게 (1 ~ 10, 11 ~ 20)
	private int startPage;	// 시작페이지	: 1, 11  ...
	private int endPage;	// 끝페이지	: 10, 20 ...
	private boolean prev, next;
	private int total;		// 전체 게시글 수 
	private Criteria cri;	// 화면에 출력하는 게시글 개수
	
	public PageDTO(int total, Criteria cri) {
		this.total = total;
		this.cri = cri;
		
		this.endPage = (int)(Math.ceil(cri.getPageNum() / 10.0)) * 10;
		this.startPage = this.endPage - 9;
		
		int realEnd = (int)(Math.ceil((total * 1.0) / cri.getAmount()));
		
		if(realEnd <= this.endPage) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}
}
