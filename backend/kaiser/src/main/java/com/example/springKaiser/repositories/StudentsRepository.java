package com.example.springKaiser.repositories;

import com.example.springKaiser.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

//Repositories manage the persisting (Saving) of data into our databases

public interface StudentsRepository extends JpaRepository<Students, Integer> {

}