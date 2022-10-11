package com.example.springKaiser.school.student;


import com.example.springKaiser.school.entities.Grades;
import com.example.springKaiser.school.entities.Students;
import com.example.springKaiser.school.entities.Teachers;
import com.example.springKaiser.school.Repository.GradeRepository;
import com.example.springKaiser.school.Repository.StudentsRepository;
import com.example.springKaiser.school.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//This is a business service,
//The point of a business service is to hold Logic, i.e,: calculations or whatever
@Service
public class StudentsService {

    //Methods that basically do the persistence (It means save data), so typically you'd say
    // I am going to build persistence into my students (Which means I'm going to save student data into my db

    @Autowired
    StudentsRepository studentsRepository;

    @Autowired
    GradeRepository gradeRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    StudentMapper studentMapper;

    final int gradeOne = 1;

    public String saveStudentOnGrade(){
        Students students = new Students();
        students.setId(0);
        students.setEmail("hallo@hal.com");
        students.setName("Hallo Peter");
        Optional<Grades> grade1 = gradeRepository.findById(1);
        students.setGrade(grade1.get());
        studentsRepository.save(students);
        return students.getName() + " has been added with grade" + students.getGrade();
    }

    public String saveStudentOnGradeOne(Students students) {
        //We only save grades 1
        try {
            if (students.getGrade().getGradenumber() == gradeOne) {
                saveStudent(students);
                return "Success" + students.getName() + " is saved";
            }
        } catch (Exception e) {
            return "Failed to save " + students.getName() + " " + e.getMessage();
        }
        return "Failed to save" + students.getName();
    }

    public String saveStudent(StudentDto studentDto){
        Students student = new Students();
        student.setEmail(studentDto.getEmail());
        student.setName(studentDto.getName());
        Grades grade = gradeRepository.findById(studentDto.getGradeId()).get();
        student.setGrade(grade);
        Teachers teacher = teacherRepository.findById(studentDto.getHomeGradeTeacherId()).get();
        student.setHomeGradeTeacher(teacher);
        studentsRepository.save(student);
        return "Success " + student.getName();
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

    public List<StudentDto> getListOfStudents() {
        List<StudentDto> studentsDtos = studentMapper.toList(studentsRepository.findAll());
        return studentsDtos;
    }

    public List<Students> listStudentsByGrade(int studentGrade) {
        List<Students> studentsOnThatSpecificGrade = new ArrayList<>();
        for(Students student : listStudents()) {
            if (student.getGrade().getGradenumber() == studentGrade) {
                studentsOnThatSpecificGrade.add(student);
            }
        }
        return studentsOnThatSpecificGrade;
    }

    public List<Students> findStudentByEmail(String email) {
        List<Students> listStudents = studentsRepository.findByEmail(email);
        return listStudents;
    }
}
