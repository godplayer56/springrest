package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl()  {
		list=new ArrayList<>();
		list.add(new Course(145,"java core course","this course contains basics of java"));
		list.add(new Course(4343,"spring boot course","creating rest api"));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}
}
