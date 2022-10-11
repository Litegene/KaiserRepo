package com.example.springKaiser.school.Repository;

import com.example.springKaiser.school.entities.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository  extends JpaRepository<Teachers, Integer> {
}
