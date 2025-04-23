package com.edupro.EducationWeb.service.ServiceImplemantation;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edupro.EducationWeb.entity.LAB.LABSubject;
import com.edupro.EducationWeb.exception.CustomRuntimeException;
import com.edupro.EducationWeb.repository.LAB.LABSubjectRepository;
import com.edupro.EducationWeb.service.LabService;

@Service
public class LabServiceImplementation  implements LabService{

    @Autowired
    private LABSubjectRepository labSubjectRepository;


    @Override
    public LABSubject save(LABSubject labSubject) {
       try {
            labSubject.setCreationDate(LocalDateTime.now());
            return labSubjectRepository.save(labSubject);
        } catch (Exception e) {
           throw new CustomRuntimeException(false, e.getMessage(), "labSubject_Post",
                    "labSubject", List.of());
        }
    }

    @Override
    public List<LABSubject> getall() {
        try {
            return labSubjectRepository.findAll();
            } catch (Exception e) {
             throw new CustomRuntimeException(false, e.getMessage(), "labSubject_Post",
             "labSubject", List.of());
            }
    }
    
}
