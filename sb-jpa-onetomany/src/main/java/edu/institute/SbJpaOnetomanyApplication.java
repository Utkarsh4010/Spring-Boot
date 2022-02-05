package edu.institute;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.institute.entity.Answer;
import edu.institute.entity.Question;
import edu.institute.repository.AnswerRepo;
import edu.institute.repository.QuestionRepo;

@SpringBootApplication
public class SbJpaOnetomanyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SbJpaOnetomanyApplication.class, args);
		
		QuestionRepo qrepo=ctx.getBean(QuestionRepo.class);
		AnswerRepo arepo=ctx.getBean(AnswerRepo.class);
		 // qrepo.deleteById(1);
		/*
		  Question ques =qrepo.findById(1).get();
		  
		  System.out.println(ques.getTitle());
		  System.out.println(ques.getDescription());
		  
		  for(Answer ans:ques.getAnswers()) {
			  System.out.println("====================");
			  System.out.println(ans.getAnswer());
		  }*/
		  
//		  Answer ans =arepo.findById(12).get();
//		  System.out.println(ans.getQid().getTitle());
//		  System.out.println(ans.getAid());
//		  System.out.println(ans.getAnswer());
//		  
		
		 /* 
		  Question q = new Question();
		  q.setTitle("What is JAVA ?");
		  q.setDescription("want to know about java language");
		  
		  q=qrepo.save(q);
		  
		  Answer  a1=new Answer();
		  a1.setAnswer("Java is a programming language.");
		  a1.setQid(q);
		  
		  Answer a2=new Answer();
		  a2.setAnswer("Java is Object Orientede Programming Language.");
		  a2.setQid(q);
		  
		  Answer a3 = new Answer();
		  a3.setAnswer("Java language is use to develope a application");
		  a3.setQid(q);
		  
		  arepo.save(a1);
		  arepo.save(a2);
		  arepo.save(a3);
	  */
	 
		
	}

}
