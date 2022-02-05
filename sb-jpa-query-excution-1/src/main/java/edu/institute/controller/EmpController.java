package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Employee;
import edu.institute.repo.EmployeeRepository;

@RestController
public class EmpController {
	
	@Autowired
	private EmployeeRepository repo;
	
	@PostMapping("/employee/save")
	public Employee saveEmp(@RequestBody Employee emp) {
		return repo.save(emp);
	}
	
	@GetMapping("/employee/all")
	public List<Employee> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/employee/get-city/{city}")
	public List<Employee>getbyCity(@PathVariable("city") String city){
		return repo.findByCity(city);
	}

}
