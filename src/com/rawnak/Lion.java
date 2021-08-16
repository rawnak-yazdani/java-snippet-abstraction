package com.rawnak;

public class Lion extends Animal {
    public Lion(int legs){
        super(legs);
    }

    @Override
    public String getDiets(){
        return "Meat";
    }
}
