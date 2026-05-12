package com.example;

import java.util.List;

public class Lion {
    private boolean hasMane;
    private Predator predator;

    public Lion(String sex, Predator predator) throws Exception {
        this.predator = predator;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного — самец или самка");
        }
    }

    public int getKittens() throws Exception {
        return predator.getKittens();
    }

    public List<String> getFood() throws Exception {
        return predator.getFood("Хищник");
    }

    public List<String> eatMeat() throws Exception {
        return predator.eatMeat();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }
}