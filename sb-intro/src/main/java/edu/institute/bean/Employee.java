package edu.institute.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
   
	
	@Autowired
	private Address address;
	public Employee() {
		System.out.println("Employee Created");
	}
}
