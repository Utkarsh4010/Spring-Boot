package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-core-config.xml");
         Student st1 = ctx.getBean("stud", Student.class);
         Student st2 = ctx.getBean("stud", Student.class);
         Student st3 = ctx.getBean("stud", Student.class);
         Student st4 = ctx.getBean("stud", Student.class);
    }
}
