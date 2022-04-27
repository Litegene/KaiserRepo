package com.example.springKaiser.business.student;


import com.example.springKaiser.entities.Students;
import com.example.springKaiser.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//This is a business service,
//The point of a business service is to hold Logic, i.e,: calculations or whatever
@Service
public class StudentsService {

    //Methods that basically do the persistence (It means save data), so typically you'd say
    // I am going to build persistence into my students (Which means I'm going to save student data into my db

    @Autowired
    StudentsRepository studentsRepository;

    public String saveStudentOnGrade(){
        Students students = new Students();
        students.setId(0);
        students.setEmail("hallo@hal.com");
        students.setName("Hallo Peter");
        students.setGrade(1);
        studentsRepository.save(students);
        return students.getName() + " has been added with grade" + students.getGrade();
    }

    public String saveStudentOnGradeOne(Students students){
        //We only save grades 1
        if(students.getGrade() == 1){
            saveStudent(students);
        }
        return "Success" + students.getName() + " is saved";
    }

    public void saveStudent(Students students){
        studentsRepository.save(students);
    }

    public String listStudentsString() {
        List<Students> listStudents = studentsRepository.findAll();
        String totalStrings = "";
        for (Students str : listStudents) {
            totalStrings += str.getName() + " " + str.getEmail() + " -=---";
        }
        return totalStrings;
    }

    public List<Students> listStudents() {
        List<Students> listStudents = studentsRepository.findAll();
        return listStudents;
    }

    public List<Students> listStudentsByGrade(int studentGrade) {
        List<Students> studentsOnThatSpecificGrade = new ArrayList<>();
        for(Students student : listStudents()) {
            if (student.getGrade() == studentGrade) {
                studentsOnThatSpecificGrade.add(student);
            }
        }
        return studentsOnThatSpecificGrade;
    }
}
