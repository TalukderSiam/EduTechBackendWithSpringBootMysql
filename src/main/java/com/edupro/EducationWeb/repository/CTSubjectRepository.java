package com.edupro.EducationWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edupro.EducationWeb.entity.CTSubject;
import com.edupro.EducationWeb.entity.CourseDetail;

public interface CTSubjectRepository extends JpaRepository<CTSubject, Integer>{
    
}
