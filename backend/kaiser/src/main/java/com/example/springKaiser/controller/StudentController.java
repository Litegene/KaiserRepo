package com.example.springKaiser.controller;

import com.example.springKaiser.entities.Students;
import com.example.springKaiser.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepo;

    //RESTFUL Webservice - /students
    @GetMapping("/students")
    public String listAll() {
        List<Students> listStudents = studentRepo.findAll();
        String totalStrings = "";
        for (Students str : listStudents) {
            totalStrings += str.getName() + " " + str.getEmail() + " -=---";
        }
        return totalStrings;
    }

}