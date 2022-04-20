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
}