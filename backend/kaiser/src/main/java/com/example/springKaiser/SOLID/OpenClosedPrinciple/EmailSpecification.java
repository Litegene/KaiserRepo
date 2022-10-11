package com.example.springKaiser.SOLID.OpenClosedPrinciple;

import com.example.springKaiser.school.entities.Students;

public class EmailSpecification implements Specification<Students> {

    private String email;

    public EmailSpecification(String email){
        this.email = email;
    }

    @Override
    public boolean isSatisfied(Students item) {
        return item.getEmail().equals(email);
    }
}
