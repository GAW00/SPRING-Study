package com.lgy.spring_8_3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//스프링 설정파일로 사용
@Configuration
@Profile("dev")
//  개발 서버 정보
public class ApplicationConfigDev {
//	serverInfo 객체 생성
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("localhost");
		info.setPortNum("8181");
		
		return info;
	}
}
