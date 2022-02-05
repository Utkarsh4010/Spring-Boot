package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Course;
import edu.institute.repo.CourseRepository;

@RestController
@RequestMapping("/course/")  //common url write here
public class CourseController {
	
	@Autowired
	private CourseRepository repo;
	
	@PostMapping("create")
	public Course saveCourse(@RequestBody Course course) {
		return (Course) repo.save(course);
	}

	@GetMapping("getall")
	public List<Course>getAll(){
		return repo.findAll();
		
	}
	
	@GetMapping("getcourse")
	public List<Course>getByName(@Param("title") String title,@Param("fees")double fees){
		return repo.getCourseByName(fees, title);
	}
}
