package com.example.springKaiser.school.controller;

import com.example.springKaiser.school.student.StudentDto;
import com.example.springKaiser.school.student.StudentsService;
import com.example.springKaiser.school.entities.Students;
import com.example.springKaiser.school.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String addStudentOnGradeOne(@RequestBody Students students){
        return studentsService.saveStudentOnGradeOne(students);
    }

//    adds any student details
//    @PostMapping("/addStudentOnGradeOne")
//    public void addStudentOnGradeOne(@RequestBody Students students){
//        studentsService.saveStudent(students);
//    }

    @GetMapping("/findStudentByEmail/{emailAddress}")
    public List<Students> getStudentsByEmail(@PathVariable String email) {
        return studentsService.findStudentByEmail(email);
    }

    @PostMapping("/saveStudentDto")
    public String addStudents(@RequestBody StudentDto studentDto) {
        return studentsService.saveStudent(studentDto);
    }

    @GetMapping("/getStudentDtoList")
        public List<StudentDto> getStudentsDtos() {
            return studentsService.getListOfStudents();
    }

}