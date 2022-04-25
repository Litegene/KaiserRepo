package com.example.springKaiser.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students",schema="public")
public class Students {
    @Id
    private Integer id;
    private String name;
    private String email;

    public Students(){}

    public Students(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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