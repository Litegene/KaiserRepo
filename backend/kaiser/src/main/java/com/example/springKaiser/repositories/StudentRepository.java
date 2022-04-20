package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students, Integer> {

}