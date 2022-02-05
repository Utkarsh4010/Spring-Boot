package edu.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.bean.Employee;

@RestController
public class RestIntroController {
    
	@GetMapping("/welcome/get")
	 public String WelcomeGetApi() {
		 return"Welcome to first Http GET REST Api";
	 }
	
	@PostMapping("/welcome/post")
	public String WelcomePostApi() {
		return"Welcome to first Http POST REST Api";
	}
	
	@GetMapping("/employee/get")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(121);
		emp.setName("ABCD");
		emp.setContact("8855221133");
		return emp;
	}
}
