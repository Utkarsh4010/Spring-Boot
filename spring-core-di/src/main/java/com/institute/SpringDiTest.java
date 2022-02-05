package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.institute.bean.Student;

public class SpringDiTest {

	public static void main(String[] args) {
          ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-di.xml");
          Student st = ctx.getBean("stud", Student.class);
          System.out.println("ID :" +st.getId());
          System.out.println("Name :"+st.getName());
          System.out.println("Address Details: ");
          System.out.println("City :" +st.getAddress().getCity());
          System.out.println("State :" +st.getAddress().getState());
          System.out.println("Educational Details :");
          System.out.println("College Name : " +st.getHigherEdu().getInstituteName());
          System.out.println("Passing Year : " +st.getHigherEdu().getPassingYear());
          System.out.println("Percentage : " +st.getHigherEdu().getPercent());


	
	}

}
