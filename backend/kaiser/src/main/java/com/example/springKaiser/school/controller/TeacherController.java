package com.example.springKaiser.school.controller;

import com.example.springKaiser.entities.Video;
import com.example.springKaiser.school.Repository.GradeRepository;
import com.example.springKaiser.school.Repository.TeacherRepository;
import com.example.springKaiser.school.entities.Grades;
import com.example.springKaiser.school.entities.Teachers;
import com.example.springKaiser.school.teacher.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    GradeRepository gradeRepository;

    @GetMapping("/listTeachers")
    public List<Teachers> listTeachers() {
        return teacherRepository.findAll();
    }

//    @PostMapping("/saveTeacherNames")
//    public void saveTeacherNames(@RequestBody TeacherDto teacherDto) {
//        Teachers teachers =  new Teachers();
//        teachers.setName(teacherDto.getName());
//        teachers.setName(teacherDto.getSurname());
////        teachers.setId(0); TODO this needs fixing
//        Grades grades = gradeRepository.findAll().get(0);
//        teachers.setGrades(grades);
//        teacherRepository.save(teachers);
//    }

}
