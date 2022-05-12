package com.example.csvtoapi.controller;

import com.example.csvtoapi.dto.MappingDto;
import com.example.csvtoapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentMappingController extends AbstractController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/mapping")
    public MappingDto retrieveMapping(){
        return studentService.getMapping();
    }
}
