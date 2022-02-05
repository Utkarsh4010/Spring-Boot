package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class); 
         Question ques = ctx.getBean("ques", Question.class);
         ques.askQuestion();
    }
}
