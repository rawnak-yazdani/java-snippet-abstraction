package com.rawnak;

public abstract class Animal {
    private int legs;

    public Animal(int legs){
        this.legs = legs;
    }

    public abstract String getDiets();
}
