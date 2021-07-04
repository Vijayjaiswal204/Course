package com.springbootrest.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootrest.course.entites.Course;

@Service
public class CoursesServiceImpl implements CoursesService {
	
	List<Course> list;
	public CoursesServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(111,"java Spring core","learn spring core"));
		list.add(new Course(112,"java Spring maven","RestApi using spring boot"));
		list.add(new Course(113,"java Spring Boot","RestApi using spring boot"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
