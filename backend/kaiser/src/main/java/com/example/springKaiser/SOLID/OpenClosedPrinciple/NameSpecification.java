package com.example.springKaiser.SOLID.OpenClosedPrinciple;

import com.example.springKaiser.school.entities.Students;

public class NameSpecification implements Specification<Students> {

    private String name;

    public NameSpecification(String name){
        this.name = name;
    }

    @Override
    public boolean isSatisfied(Students item) {
        return item.getName().equals(name);
    }
}
