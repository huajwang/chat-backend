package com.longmaple.edu.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

	List<Course> findByCategory(String courseCategory);
}
