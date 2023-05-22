package com.lgy.spring_ex6_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEmployee {
	public static void main(String[] args) {
		AbstractApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:employeeCTX.xml");
		AbstractApplicationContext ctx3 = new GenericXmlApplicationContext("classpath:employeeCTX2.xml");
		
		Employee employee1 = ctx1.getBean("employee1", Employee.class);
		EmployeeInfo employeeInfo = ctx1.getBean("employeeInfo1", EmployeeInfo.class);
		Employee employee2 = employeeInfo.getEmployee();
		Employee employee3 = ctx3.getBean("employee3", Employee.class);
		
		System.out.println(employee1.getName() + ", " + employee1.getSalary() + ", " + employee1.getLicense());
		System.out.println("=============================================");
		System.out.println(employee2.getName() + ", " + employee2.getSalary() + ", " + employee2.getLicense());
		System.out.println("=============================================");
		System.out.println(employee3.getName() + ", " + employee3.getSalary() + ", " + employee3.getLicense());
		System.out.println("=============================================");
		
	}
}
