package com.edupro.EducationWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edupro.EducationWeb.entity.CourseIndex;

@Repository
public interface CourseIndexRepository extends JpaRepository<CourseIndex, Integer> {

    
    CourseIndex findBysubjectName(String subjectName);
    
}
