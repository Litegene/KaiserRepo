package com.example.springKaiser.school.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students",schema="public")
public class Students {

    //The entity needs to be aligned with Database structure
    //So if you change the db table you gotta change the entity

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    @ManyToOne
    @JoinColumn(name = "grade_id")
    private Grades grade;
    @ManyToOne
    @JoinColumn(name = "home_grade_teacher_id")
    private Teachers homeGradeTeacher;

    public Students(){}

    public Students(Integer id, String name, String email, Grades grade, Teachers teachers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.homeGradeTeacher = teachers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Grades getGrade() {
        return grade;
    }

    public void setGrade(Grades grade) {
        this.grade = grade;
    }

    public Teachers getHomeGradeTeacher() {
        return homeGradeTeacher;
    }

    public void setHomeGradeTeacher(Teachers homeGradeTeacher) {
        this.homeGradeTeacher = homeGradeTeacher;
    }
}