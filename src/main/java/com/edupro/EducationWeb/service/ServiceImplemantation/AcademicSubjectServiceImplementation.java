package com.edupro.EducationWeb.service.ServiceImplemantation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edupro.EducationWeb.entity.AcademicSubject;
import com.edupro.EducationWeb.repository.AcademicSubjectRepository;
import com.edupro.EducationWeb.service.AcademicSubjectService;
@Service
public class AcademicSubjectServiceImplementation  implements AcademicSubjectService{
    @Autowired
    private AcademicSubjectRepository academicSubjectRepository;
    @Override
    public void save(AcademicSubject academicSubject) {
       
      try {
        
        academicSubjectRepository.save(academicSubject);

      } catch (Exception e) {
        
      }
    }
    @Override
    public List<AcademicSubject> getall() {
       try {
       return academicSubjectRepository.findAll();
       } catch (Exception e) {
       return List.of();
       }
    }
    
}
