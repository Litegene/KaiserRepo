package com.example.springKaiser.school.Repository;

import com.example.springKaiser.school.entities.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository  extends JpaRepository<Grades, Integer> {
}
