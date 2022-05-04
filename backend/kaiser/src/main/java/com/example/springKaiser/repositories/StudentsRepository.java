package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.Students;
import com.example.springKaiser.entities.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

//Repositories manage the persisting (Saving) of data into our databases

public interface StudentsRepository extends JpaRepository<Students, Integer> {

    /*Spring Data Derived Queries
    https://www.baeldung.com/spring-data-derived-queries
    */
    List<Students> findByEmail(String email);

    @Query(value = "select * FROM teachers a JOIN grades g ON a.agent_id = a.id WHERE s.application_number = :applicationNumber", nativeQuery = true)
    List<Teachers> findTeacherByStudentNameAndEmail(String studentName, String email);
}