package com.lgy.ShoppingMall.dto;

import java.sql.Timestamp;

import javax.management.timer.TimerMBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoticeDto {
	private int noticode; //�۹�ȣ
	private String notiauth; //�ۼ���
	private String notititle; //������
	private String noticont; //�۳���
	private Timestamp notidate; //�ۼ���¥
	private int notihit;
	private String notipwd;
}