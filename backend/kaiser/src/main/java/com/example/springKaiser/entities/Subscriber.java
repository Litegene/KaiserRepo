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

    public Integer getSubscriber_id() {
        return subscriber_id;
    }

    public void setSubscriber_id(Integer subscriber_id) {
        this.subscriber_id = subscriber_id;
    }

    public String getSubscriber_name() {
        return subscriber_name;
    }

    public void setSubscriber_name(String subscriber_name) {
        this.subscriber_name = subscriber_name;
    }
}