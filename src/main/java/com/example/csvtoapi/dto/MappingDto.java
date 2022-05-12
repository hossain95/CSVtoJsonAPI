package com.example.csvtoapi.dto;

import java.util.ArrayList;
import java.util.List;

public class MappingDto {

    private final List<StudentMapping> studentMappings = new ArrayList<>();

    public static class StudentMapping{
        private String code;
        private String name;


        public StudentMapping(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public void addStudentMapping(String code, String name){
        studentMappings.add(new StudentMapping(code, name));
    }

    public List<StudentMapping> getStudentMappings() {
        return studentMappings;
    }
}
