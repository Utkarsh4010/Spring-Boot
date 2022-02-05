package com.institute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.institute")
public class Config {
	@Bean("ans1")
	//@primary
	public Answer getAns() {
		Answer ans= new Answer();
		return ans;
	}

}
