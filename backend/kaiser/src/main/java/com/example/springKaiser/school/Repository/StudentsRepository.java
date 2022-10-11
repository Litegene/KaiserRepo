package com.example.springKaiser.school.Repository;

import com.example.springKaiser.school.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Repositories manage the persisting (Saving) of data into our databases

public interface StudentsRepository extends JpaRepository<Students, Integer> {

    /*Spring Data Derived Queries
    https://www.baeldung.com/spring-data-derived-queries
    */
    List<Students> findByEmail(String email);

//    @Query(value = "select * FROM teachers a JOIN grades g ON a.agent_id = a.id WHERE s.application_number = :applicationNumber", nativeQuery = true)
//    List<Teachers> findTeacherByStudentNameAndEmail(String studentName, String email);
}