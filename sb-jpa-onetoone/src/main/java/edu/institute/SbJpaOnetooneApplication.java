package edu.institute;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import edu.institute.entity.StudentAddress;
import edu.institute.entity.StudentInfo;
import edu.institute.repo.StudentAddressRepository;
import edu.institute.repo.StudentInfoRepository;

@SpringBootApplication
public class SbJpaOnetooneApplication {
       @Bean
       public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
    	   ObjectMapper mapper = new ObjectMapper();
    	   mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
    	   MappingJackson2HttpMessageConverter converter=new MappingJackson2HttpMessageConverter(mapper);
    	   return converter;
       }
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbJpaOnetooneApplication.class, args);
		StudentInfoRepository infoRepo=ctx.getBean(StudentInfoRepository.class);
		StudentAddressRepository addRepo = ctx.getBean(StudentAddressRepository.class);
		
		/*
		StudentInfo info = new StudentInfo();
		info.setName("A");
		info.setEmail("a@gmail.com");
		info.setContact("9966551122");
		
		info = infoRepo.save(info);
		
		StudentAddress add =new StudentAddress();
		add.setCity("Mumbai");
		add.setPin("413512");
		add.setState("MH");
		add.setSid(info);
		
		addRepo.save(add);
		
		List<StudentAddress>studAdd=addRepo.findAll();
		
		for(StudentAddress ad:studAdd) {
			System.out.println("Name :" +ad.getSid().getName());
			System.out.println("City ;"+add.getCity());
			System.out.println("State :"+ add.getState());
			System.out.println("Pincode : " + add.getPin());
			System.out.println("=====================");
		}
		*/
		
	}

}
