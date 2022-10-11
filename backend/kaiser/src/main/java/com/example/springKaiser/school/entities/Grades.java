package com.example.springKaiser.school.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "grades",schema="public")
public class Grades {

    @Id
    private Integer id;
    private Integer gradenumber;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public Integer getGradenumber() {
        return gradenumber;
    }

    public void setGradenumber(Integer gradenumber) {
        this.gradenumber = gradenumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
