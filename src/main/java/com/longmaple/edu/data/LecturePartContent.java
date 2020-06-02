package com.longmaple.edu.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_edu_lecture_part_content")
public class LecturePartContent {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer contentId;
	private String partContent;
	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	
	public String getPartContent() {
		return partContent;
	}
	public void setPartContent(String partContent) {
		this.partContent = partContent;
	}
	
}
