package com.example.springKaiser.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
@Entity
@Table(name = "subscribertable",schema="public")
public class Subscriber {
    @Id
    private Integer subscriber_id;

    @Column(name = "subscriber_name")
    private String subscriberName;

    public Subscriber(){}

    public Subscriber(Integer id, String name) {
        this.subscriber_id = id;
        this.subscriberName = name;
    }

    public Integer getSubscriber_id() {
        return subscriber_id;
    }

    public void setSubscriber_id(Integer subscriber_id) {
        this.subscriber_id = subscriber_id;
    }

    public String getSubscriber_name() {
        return subscriberName;
    }

    public void setSubscriber_name(String subscriber_name) {
        this.subscriberName = subscriber_name;
    }
}