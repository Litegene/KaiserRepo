package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository  extends JpaRepository<Teachers, Integer> {
}
