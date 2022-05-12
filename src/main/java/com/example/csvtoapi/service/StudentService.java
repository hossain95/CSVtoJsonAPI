package com.example.csvtoapi.service;

import com.example.csvtoapi.dto.MappingDto;
import com.example.csvtoapi.entity.StudentMapping;

public interface StudentService {
    MappingDto getMapping();
    StudentMapping getBmccMapping(String code);
}
