package com.springbootrest.course.service;

import java.util.List;

import com.springbootrest.course.entites.Course;


public interface CoursesService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);

	public Course addCourse(Course course);

}
