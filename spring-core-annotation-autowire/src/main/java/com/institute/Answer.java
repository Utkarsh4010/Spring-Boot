package com.institute;

import org.springframework.stereotype.Component;

@Component

public class Answer {
	public Answer() {
		System.out.println("Answer created");
	}
	
	public void displayAnswer() {
		System.out.println("Your answer displayed here");
	}

}
