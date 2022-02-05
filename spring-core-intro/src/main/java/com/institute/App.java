package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-core-config.xml");
        Student student =ctx.getBean("st", Student.class);// to get the object from Spring container
        student.print();
        System.out.println("Application Closed");
        }
}
