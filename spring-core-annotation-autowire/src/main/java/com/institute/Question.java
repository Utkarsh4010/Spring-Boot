package com.institute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ques")

public class Question {
       
	
	@Autowired
	@Qualifier("ans1")
	private Answer ans;
	
	public void askQuestion() {
		System.out.println("This is question class");
		ans.displayAnswer();
	}
		
}
