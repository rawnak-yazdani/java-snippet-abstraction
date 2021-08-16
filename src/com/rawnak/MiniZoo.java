package com.rawnak;

public class MiniZoo {
//    private Animal[] animals;

//    public MiniZoo(Animal[] animals){
//        this.animals = animals;
//    }

    public void printDietsOfAllAnimals(Animal animal){
//        for(Animal animal : animals){
//            String diets = animal.getDiets();
//            String name = animal.getClass().getSimpleName();
//            System.out.println(name + " eats " + diets + ".");
//        }
        String diets = animal.getDiets();
        String name = animal.getClass().getSimpleName();
        System.out.println(name + " eats " + diets + ".");
    }
}
