package com.longmaple.edu.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_edu_course")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer courseId;
	private String courseName;
	private String category;
	private String displayName;
	private String courseDescription;
//	private Integer teacherId;
	private BigDecimal price;
	private Integer enrolled;
	private Integer ratings;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdated;
	private Float timeLength;
	private String previewUrl;
	
	@ManyToOne
    @JoinColumn(name = "teacher_id")
	private Teacher teacher;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "courseId")
	private List<CourseContent> courseContents = new ArrayList<>();
	
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getEnrolled() {
		return enrolled;
	}
	public void setEnrolled(Integer enrolled) {
		this.enrolled = enrolled;
	}
	public Integer getRatings() {
		return ratings;
	}
	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Float getTimeLength() {
		return timeLength;
	}
	public void setTimeLength(Float timeLength) {
		this.timeLength = timeLength;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<CourseContent> getCourseContents() {
		return courseContents;
	}
	public void setCourseContents(List<CourseContent> courseContents) {
		this.courseContents = courseContents;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}
