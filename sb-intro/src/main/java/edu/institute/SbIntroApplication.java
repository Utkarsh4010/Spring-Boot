package edu.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//@Configuration, @EnableAutoConfiguration and @ComponentScan.
@SpringBootApplication
public class SbIntroApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SbIntroApplication.class, args);
	}

}
