package com.example.springKaiser.SOLID.OpenClosedPrinciple;

import com.example.springKaiser.school.entities.Students;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Students>{
    @Override
    public Stream<Students> filter(List<Students> items, Specification<Students> spec) {
        return items.stream().filter( studs -> spec.isSatisfied(studs));
    }
}
