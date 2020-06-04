package com.longmaple.edu.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseContentRepo extends JpaRepository<CourseContent, Integer> {

	List<CourseContent> findByCourseId(Integer courseId);

}
