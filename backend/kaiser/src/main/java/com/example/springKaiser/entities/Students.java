package com.example.springKaiser.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students",schema="public")
public class Students {

    //The entity needs to be aligned with Database structure
    //So if you change the db table you gotta change the entity

    @Id
    private Integer id;
    private String name;
    private String email;
    private Integer grade;

    public Students(){}

    public Students(Integer id, String name, String email, Integer grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
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
}