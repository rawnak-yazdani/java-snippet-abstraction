package com.rawnak;

public class Tiger extends Animal {
    public Tiger(int legs){
        super(legs);
    }

    @Override
    public String getDiets(){
        return "Meat";
    }
}
