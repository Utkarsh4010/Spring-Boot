package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.StudentEducation;
import edu.institute.repo.StudentEducationRepository;

@RestController
@RequestMapping("/education-details/")
public class StudentEducationController {
  @Autowired
  private StudentEducationRepository repo;
  
  @PostMapping("save")
  public StudentEducation saveEduDetails(@RequestBody StudentEducation edu) {
	  return repo.save(edu);
  }
  
  @PostMapping("getall")
  public List<StudentEducation>getAllEduDetails(){
	  return repo.findAll();
  }
}
