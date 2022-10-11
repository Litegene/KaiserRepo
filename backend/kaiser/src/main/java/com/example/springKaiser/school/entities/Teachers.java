package com.example.springKaiser.school.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "teachers",schema="public")
public class Teachers {

    @Id
    private Integer id;
    private String name;
    private String surname;
    @ManyToOne
    @JoinColumn(name = "gradesid")
    private Grades grades;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }
}
