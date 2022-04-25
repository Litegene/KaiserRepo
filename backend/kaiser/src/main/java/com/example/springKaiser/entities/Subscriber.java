package com.example.springKaiser.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "subscribertable",schema="public")
public class Subscriber {
    @Id
    private Integer subscriber_id;
    private String subscriber_name;

    public Subscriber(){}

    public Subscriber(Integer id, String name) {
        this.subscriber_id = id;
        this.subscriber_name = name;
    }
}