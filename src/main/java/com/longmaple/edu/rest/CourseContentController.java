package com.longmaple.edu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.longmaple.edu.data.CourseContent;
import com.longmaple.edu.data.CourseContentRepo;

@Controller
@RequestMapping("/course_content")
public class CourseContentController {
	
	@Autowired
	private CourseContentRepo courseContentRepo;
	
	@RequestMapping
	@ResponseBody
	public List<CourseContent> getCourseContents() {
		return courseContentRepo.findAll();
	}
}
