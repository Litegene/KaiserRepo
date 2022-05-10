package com.example.springKaiser.SOLID.OpenClosedPrinciple;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
