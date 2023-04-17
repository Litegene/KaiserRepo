package com.example.springKaiser.AbstractExample;

import com.example.springKaiser.AbstractExample.AnimalInheritance.UseAnimals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UseAnimalsTest {

    @Autowired
    private UseAnimals useAnimals;

    @Test
    void exampleMethod() {
        useAnimals.exampleMethod();
    }
}