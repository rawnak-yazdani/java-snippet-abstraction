package com.rawnak;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal[] animals = new Animal[3];
        animals[0] = new Deer(4);
        animals[1] = new Lion(4);
        animals[2] = new Tiger(4);

//        MiniZoo miniZoo = new MiniZoo(animals);
        MiniZoo miniZoo = new MiniZoo();

        for (int i = 0; i < 3; i++) {
            miniZoo.printDietsOfAllAnimals(animals[i]);
        }
    }
}
