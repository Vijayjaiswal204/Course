package com.springbootrest.course.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springbootrest.course.entites.Course;

import com.springbootrest.course.service.CoursesService;

@RestController             //
public class MyController {
	
	@Autowired
	private CoursesService coursesService;
	
	//@GetMapping("/home")  
	@RequestMapping(path = "/home", method = RequestMethod.GET) // we may use GetMapping also 
	public String home() {
		return "Welcome to home";
	}
	
	//Get all courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.coursesService.getCourses();
		
	}
	
	//Get single course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.coursesService.getCourse(Long.parseLong(courseId));

	}
	
	//Add course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.coursesService.addCourse(course);
	}

}
