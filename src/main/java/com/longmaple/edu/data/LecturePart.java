package com.longmaple.edu.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_edu_lecture_part")
public class LecturePart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer partId;
	private String partName;
	private String partDescription;
	private String videoUrl;
	private String length;
	private Boolean preview;
	private Integer type;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "part_id")
	private List<LecturePartContent> lecturePartContents = new ArrayList<>();
	
	public Integer getPartId() {
		return partId;
	}
	public void setPartId(Integer partId) {
		this.partId = partId;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public Boolean getPreview() {
		return preview;
	}
	public void setPreview(Boolean preview) {
		this.preview = preview;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public List<LecturePartContent> getLecturePartContents() {
		return lecturePartContents;
	}
	public void setLecturePartContents(List<LecturePartContent> lecturePartContents) {
		this.lecturePartContents = lecturePartContents;
	}
	
}
