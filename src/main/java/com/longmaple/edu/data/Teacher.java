package com.longmaple.edu.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_edu_teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer teacherId;
	private String accountName;
	private String teacherName;
	private String teacherIntroduction;
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy="teacher")
//	private List<Course> courses = new ArrayList<>();

	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
//	public List<Course> getCourses() {
//		return courses;
//	}
//	public void setCourses(List<Course> courses) {
//		this.courses = courses;
//	}
	public String getTeacherIntroduction() {
		return teacherIntroduction;
	}
	public void setTeacherIntroduction(String teacherIntroduction) {
		this.teacherIntroduction = teacherIntroduction;
	}
	
}
