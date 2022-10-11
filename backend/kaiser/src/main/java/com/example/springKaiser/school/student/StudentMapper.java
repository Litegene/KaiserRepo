package com.example.springKaiser.school.student;

import com.example.springKaiser.school.entities.Students;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentMapper {

    StudentDto toDto(Students students) {
        StudentDto studentDto = new StudentDto();
        studentDto.setName(students.getName());
        studentDto.setEmail(students.getEmail());
        studentDto.setGradeId(students.getGrade().getId());
        studentDto.setHomeGradeTeacherId(students.getHomeGradeTeacher().getId());
        return studentDto;
    }

    List<StudentDto> toList(List<Students> studentsList) {
        List<StudentDto> studentDtoList = new ArrayList<>();
        //Same as below
//        for (Students studentElement : studentsList){
//            studentDtoList.add(toDto(studentElement));
//        }

        for (int i = 0; i < studentsList.size(); i++) {
            StudentDto studentDto = toDto(studentsList.get(i));
            studentDtoList.add(studentDto);
        }
        return studentDtoList;
    }
}