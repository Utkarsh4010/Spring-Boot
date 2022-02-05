package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Employees;
import edu.institute.repository.EmployeesRepository;

@RestController
public class EmployeesController {
   @Autowired
   private EmployeesRepository empRepo;
   
   @PostMapping("/employees/save")
   public Employees saveEmployees(@RequestBody Employees employees) {
	   return empRepo.save(employees);
   }
   
   @GetMapping("/employees/get-all")
   public List<Employees> getAllEmployees(){
	   return empRepo.findAll();
   }
   
   @DeleteMapping("/employees/delete/{id}")
   public String deleteEmployees(@PathVariable int id) {
	   empRepo.deleteById(id);
	   return "Employees deleted successfully";
   }
   
   @PutMapping("/employees/update")
   public Employees updateEmployees(@RequestBody Employees employees) {
	   return empRepo.save(employees);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
