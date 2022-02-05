package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.institute.bean.Employee;

public class Main {

	public static void main(String[] args) {
	  ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-core-autowire.xml");
	  Employee e=ctx.getBean("emp0",Employee.class);
	  System.out.println("Id :"+e.getId());
	  System.out.println("Name :"+e.getName());
	  System.out.println("City :"+e.getAdd().getCity());
	  System.out.println("Company Name :" + e.getExpe().getCompanyName());
	  

	}

}
