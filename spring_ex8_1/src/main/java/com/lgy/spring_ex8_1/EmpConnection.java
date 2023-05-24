package com.lgy.spring_ex8_1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class EmpConnection implements EnvironmentAware, InitializingBean{
	private Environment env;
	private String empId;
	private String empPw;
	
	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("@# setEnvironment()");
		setEnv(environment);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("@# afterPropertiesSet()");
		setEmpId(env.getProperty("emp.id"));
		setEmpPw(env.getProperty("emp.pw"));
	}
	
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPw() {
		return empPw;
	}
	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}
}
