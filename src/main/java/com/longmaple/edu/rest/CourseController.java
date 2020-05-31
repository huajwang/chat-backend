package com.longmaple.edu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.longmaple.edu.data.Course;
import com.longmaple.edu.data.CourseRepo;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseRepo courseRepo;
	
	
//	@RequestMapping("/getone")
//	@ResponseBody
//	public Course getArticle() {
//		Optional<Course> a = articleRepo.findById(10);
//		System.out.println(new String(a.get().getContent()));
//		System.out.println(a.get().getTxt());
//		return a.get();
//	}
//	
	@RequestMapping("/courses")
	@ResponseBody
	public List<Course> getCourses() {
		List<Course> courses = courseRepo.findAll();
		return courses;
	}
}
