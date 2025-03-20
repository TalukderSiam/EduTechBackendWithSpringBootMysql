package com.edupro.EducationWeb.service;

import java.util.List;

import com.edupro.EducationWeb.entity.CourseDetail;
import com.edupro.EducationWeb.entity.CourseIndex;

public interface CourseService {

    void save(CourseIndex courseIndex);

    CourseIndex getbysubjectname(String subjectName);
    void saveCourseDetail(CourseDetail CourseDetail);

    CourseDetail getbyIndexName(String subjectName, String topicName);

    List<CourseDetail> getallbysubjectname(String subjectName);

    
} 
