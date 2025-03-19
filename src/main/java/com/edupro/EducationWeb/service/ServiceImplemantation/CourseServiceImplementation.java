package com.edupro.EducationWeb.service.ServiceImplemantation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edupro.EducationWeb.entity.CourseDetail;
import com.edupro.EducationWeb.entity.CourseIndex;
import com.edupro.EducationWeb.repository.CourseDetailRepository;
import com.edupro.EducationWeb.repository.CourseIndexRepository;
import com.edupro.EducationWeb.service.CourseService;

@Service
public class CourseServiceImplementation implements CourseService {

   @Autowired
   private CourseIndexRepository courseIndexRepository;
   @Autowired
   private CourseDetailRepository courseDetailRepository;

   @Override
   public void save(CourseIndex courseIndex) {
      try {
         courseIndexRepository.save(courseIndex);
      } catch (Exception e) {

      }
   }

   @Override
   public CourseIndex getbysubjectname(String subjectName) {
      try {
         return courseIndexRepository.findBysubjectName(subjectName);
      } catch (Exception e) {
         return new CourseIndex();
      }
   }

   @Override
   public void saveCourseDetail(CourseDetail CourseDetail) {
      try {
         courseDetailRepository.save(CourseDetail);
      } catch (Exception e) {

      }
   }

   @Override
   public CourseDetail getbyIndexName(String subjectName, String topicName) {
      // boolean isExitsIndexForSubject =
      // courseIndexRepository.exitsIndexForSubject(subjectName,topicName);
      try {

         CourseDetail courseDetail = courseDetailRepository.findBySubjectNameAndTopicName(subjectName, topicName);
         return courseDetail;
      } catch (Exception e) {
         return new CourseDetail();
      }

   }
}
