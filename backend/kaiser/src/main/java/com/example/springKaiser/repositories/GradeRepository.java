package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository  extends JpaRepository<Grades, Integer> {
}
