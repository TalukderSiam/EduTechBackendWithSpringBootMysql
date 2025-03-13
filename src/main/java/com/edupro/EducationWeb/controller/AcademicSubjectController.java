package com.edupro.EducationWeb.controller;

import org.springframework.web.bind.annotation.RestController;

import com.edupro.EducationWeb.entity.AcademicSubject;
import com.edupro.EducationWeb.entity.response.RootResponseModel;
import com.edupro.EducationWeb.service.AcademicSubjectService;
import com.edupro.EducationWeb.utils.ResponseOfApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/academicsubject")
@CrossOrigin(origins = "http://localhost:5173")
public class AcademicSubjectController {
    @Autowired
    private AcademicSubjectService academicSubjectService;
    
    @PostMapping("/post")
    public ResponseEntity<RootResponseModel<?>> save(@RequestBody AcademicSubject  academicSubject) {
        academicSubjectService.save(academicSubject);

        RootResponseModel<?> response = ResponseOfApi.makeRootResponseModelFormate(
                true,
                "AcademicSubject_Post",
                "Saved AcademicSubject Successfully",
                "AcademicSubject",
                List.of());

     System.out.println("siam");
        return ResponseEntity.ok(response);
    }


    @GetMapping("getall")
    public ResponseEntity<RootResponseModel<?>> getMethodName() {

       List<AcademicSubject>academicSubjectList= academicSubjectService.getall();
        RootResponseModel<?> response = ResponseOfApi.makeRootResponseModelFormate(
            true,
            "AcademicSubject_Get",
            "Get AcademicSubject List Successfully",
            "AcademicSubjectList",
            academicSubjectList);

 
    return ResponseEntity.ok(response);
    }
    
    
}
