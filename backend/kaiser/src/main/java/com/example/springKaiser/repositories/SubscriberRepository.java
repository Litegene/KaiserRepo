package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<Subscriber, Integer> {

}