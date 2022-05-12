package com.example.csvtoapi.service;

import com.example.csvtoapi.dto.MappingDto;
import com.example.csvtoapi.entity.StudentMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImp implements StudentService {

    private final Map<String, StudentMapping> studentMap = new HashMap<>();
    private final MappingDto mappingDto = new MappingDto();


    public StudentServiceImp(@Value("classpath:student.csv") Resource studentResource) {
        try(InputStream inputStream = studentResource.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ){
            String line = bufferedReader.readLine();
            while (!StringUtils.isEmpty(line)){
                String[] tokens = line.split(",");
                if(tokens.length != 2){
                    break;
                }

                String code = tokens[0];
                String name = tokens[1];

                studentMap.put(code, new StudentMapping(code, name));
                mappingDto.addStudentMapping(code, name);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public MappingDto getMapping() {
        return mappingDto;
    }

    @Override
    public StudentMapping getBmccMapping(String code) {
        return studentMap.get(code);
    }
}
