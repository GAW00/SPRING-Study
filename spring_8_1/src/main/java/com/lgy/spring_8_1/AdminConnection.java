package com.lgy.spring_8_1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements InitializingBean, EnvironmentAware{
//	Environment : 환경객체로 시스템 설정 값들 저장
	private Environment env; // 객체 생성전에 environment 객체를 받아서 저장
	private String adminId;
	private String adminPw;
	
//	setEnvironment : 객체 생성전 호출 ①
	@Override
		public void setEnvironment(Environment environment) {
			System.out.println("@# setEnvironment()");
//			환경객체를 env 객체에 저장
			setEnv(environment);
		}
	
//	afterPropertiesSet : 객체 생성시 호출 ②
	@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("@# afterPropertiesSet()");
//			프로퍼티 소스에서 어드민 아이디, 비밀번호 가져와 adminId, adminPw 변수에 저장
			setAdminId(env.getProperty("admin.id"));
			setAdminPw(env.getProperty("admin.pw"));
		}
	
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
}
