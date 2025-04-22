package com.edupro.EducationWeb.service;

import com.edupro.EducationWeb.entity.CTQuetion;

public interface CTQuetionService {

    CTQuetion save(String fileUrl, String courseTakenBy, int semester, int year,String subjectName);
    
}
