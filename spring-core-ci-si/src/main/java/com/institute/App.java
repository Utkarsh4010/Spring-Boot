package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-core-si-config.xml", "spring-core-ci-config.xml");
    	System.out.println("==========SI==============");
    	Product p =ctx.getBean("prod", Product.class);
    	System.out.println("Id :" + p.getId());
    	System.out.println("Name :" + p.getName());
    	System.out.println("price :" + p.getPrice());
    	System.out.println("Model :" + p.getModel());
    	System.out.println("Comments : " + p.getComment());
    	System.out.println("Ratings : " + p.getRatings());
    	
    	
        System.out.println( "================CI=======================" );
        Employee e = ctx.getBean("emp", Employee.class);
        System.out.println("Employee Id :" +e.getId());
        System.out.println("Employee Name : " + e.getName());
        System.out.println("Employee Salary : " + e.getSalary());
        System.out.println("Employee Contact :");
        for(String contact:e.getContact()) {
        	System.out.println(contact);
        }
        System.out.println("Employee Skills :" +e.getSkills());
        System.out.println("Employee Address :" + e.getAddress());
        System.out.println("Employee Companies : " + e.getCompanies());
    }
}
