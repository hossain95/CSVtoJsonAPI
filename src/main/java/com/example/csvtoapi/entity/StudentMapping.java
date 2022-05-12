package com.example.csvtoapi.entity;

import javax.validation.constraints.NotNull;

public class StudentMapping {
    @NotNull
    private String studentCode;
    @NotNull
    private String studentName;

    public StudentMapping(@NotNull String studentCode, @NotNull String studentName) {
        this.studentCode = studentCode;
        this.studentName = studentName;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
