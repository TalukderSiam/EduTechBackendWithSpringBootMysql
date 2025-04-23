package com.edupro.EducationWeb.service;

import java.util.List;

import com.edupro.EducationWeb.entity.LAB.LABSubject;

public interface LabService {

    LABSubject save(LABSubject labSubject);

    List<LABSubject> getall();

}
