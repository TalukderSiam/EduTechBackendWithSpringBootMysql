package com.edupro.EducationWeb.service.ServiceImplemantation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edupro.EducationWeb.entity.CourseIndex;
import com.edupro.EducationWeb.repository.CourseIndexRepository;
import com.edupro.EducationWeb.service.CourseService;

@Service
public class CourseServiceImplementation  implements CourseService{

    @Autowired
    private CourseIndexRepository courseIndexRepository;

    

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
    
}
