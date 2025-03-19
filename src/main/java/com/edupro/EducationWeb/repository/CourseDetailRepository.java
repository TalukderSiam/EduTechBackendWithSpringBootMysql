package com.edupro.EducationWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edupro.EducationWeb.entity.CourseDetail;
import com.edupro.EducationWeb.entity.CourseIndex;

public interface CourseDetailRepository extends JpaRepository<CourseDetail, Integer> {

    CourseDetail findBySubjectNameAndTopicName(String subjectName, String topicName);

}
