package com.longmaple.edu.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseContentRepo extends JpaRepository<CourseContent, Integer> {

}
