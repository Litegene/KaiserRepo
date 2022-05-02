package com.example.springKaiser.controller;

import com.example.springKaiser.business.student.StudentsService;
import com.example.springKaiser.entities.Students;
import com.example.springKaiser.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    private StudentsRepository studentsRepo;

    @Autowired
    private StudentsService studentsService;

    //RESTFUL Webservice - /students
    @GetMapping("/studentsList")
    public List<Students> listAll() {
        return studentsService.listStudents();
    }

    @GetMapping("/addStudentOnGrade")
    public String addStudentOnGrade() {
        //basic one don't do it this way
        return studentsService.saveStudentOnGrade();
    }

    //Get, Update, Post and Put
    //Get is a retrieval
    //Post is like a save, but more data involved
    //Put is an update I think? google it bro

    @GetMapping("/studentsList/{studentGrade}")
    public List<Students> listStudentsByGrade(@PathVariable int studentGrade) {
        return studentsService.listStudentsByGrade(studentGrade);
    }

    @PostMapping("/addStudentOnGradeOne")
    public void addStudentOnGradeOne(@RequestBody Students students){
        studentsService.saveStudentOnGradeOne(students);
    }

//    adds any student details
//    @PostMapping("/addStudentOnGradeOne")
//    public void addStudentOnGradeOne(@RequestBody Students students){
//        studentsService.saveStudent(students);
//    }


}