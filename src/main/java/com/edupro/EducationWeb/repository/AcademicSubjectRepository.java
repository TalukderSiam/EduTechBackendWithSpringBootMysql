package com.edupro.EducationWeb.repository;

import com.edupro.EducationWeb.entity.AcademicSubject;
import com.edupro.EducationWeb.entity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AcademicSubjectRepository extends JpaRepository<AcademicSubject, Integer>{
    
}
