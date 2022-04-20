package com.example.springKaiser.controller;

import com.example.springKaiser.entities.Students;
import com.example.springKaiser.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/students")
    public String listAll(Model model) {
        List<Students> listStudents = studentRepo.findAll();
        model.addAttribute("listStudents", listStudents);

        return "students";
    }

}