package com.example.springKaiser.AbstractExample.AnimalInheritance;

import org.springframework.stereotype.Service;

@Service
public class UseAnimals {
    Animal animal = new Animal() {
        @Override
        void getLegs() {

        }
    };
    Cat cat = new Cat();

    Animal catLikeCreature = new Cat();

    public void exampleMethod() {
        animal.getArms();
        cat.getArms();

        catLikeCreature.getArms();
    }


}
