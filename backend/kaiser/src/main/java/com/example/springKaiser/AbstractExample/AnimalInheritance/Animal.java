package com.example.springKaiser.AbstractExample.AnimalInheritance;

    public abstract class Animal {
        int legs;
        int arms = 5;
        abstract void getLegs();

        public int getArms() {
            return this.arms;
        }
}
