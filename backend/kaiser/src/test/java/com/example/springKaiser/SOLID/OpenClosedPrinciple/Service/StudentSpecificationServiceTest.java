package com.example.springKaiser.SOLID.OpenClosedPrinciple.Service;

import com.example.springKaiser.SOLID.OpenClosedPrinciple.BetterFilter;
import com.example.springKaiser.SOLID.OpenClosedPrinciple.NameSpecification;
import com.example.springKaiser.school.entities.Students;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentSpecificationServiceTest {

    @Test
    public void getName(){
        BetterFilter bf = new BetterFilter();
        Students students = new Students();
        students.setName("Aaaa");
//        students.setId("Aaa");
        students.setEmail("Aaa@aaa.aaa");

        Students students2 = new Students();
        students2.setName("Lol");
//        students.setId("Lol");
        students2.setEmail("Lol@lol.lol");

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(students);
        studentsList.add(students2);
        List<Students> studentList = bf.filter(studentsList, new NameSpecification("Aaaa")).collect(Collectors.toList());
        assertTrue(studentList.size()==1);
        bf.filter(studentsList, new NameSpecification("Lol"))
                .forEach(s -> System.out.println(s.getName() + " + " + s.getEmail() + " : " + s.getId()));
//        assertTrue();
    }

}