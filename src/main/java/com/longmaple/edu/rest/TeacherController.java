package com.longmaple.edu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.longmaple.edu.data.Teacher;
import com.longmaple.edu.data.TeacherRepo;

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherRepo teacherRepo;
	
	@GetMapping(value = "/lookup")
	@ResponseBody
	public Boolean isTeacher(String accountName) {
		System.out.println("isTeacher look up is calling...");
		Teacher t = new Teacher();
		t.setAccountName(accountName);
		Example<Teacher> example = Example.of(t);
		return teacherRepo.exists(example);
	}

}
