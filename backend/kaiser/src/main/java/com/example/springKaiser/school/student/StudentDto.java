package com.example.springKaiser.school.student;

public class StudentDto {

    private String name;
    private String email;
    private int gradeId;
    private int homeGradeTeacherId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getHomeGradeTeacherId() {
        return homeGradeTeacherId;
    }

    public void setHomeGradeTeacherId(int homeGradeTeacherId) {
        this.homeGradeTeacherId = homeGradeTeacherId;
    }
}
