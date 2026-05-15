package com.example;

import java.util.List;

public class Lion {

    private final Predator predator;
    private boolean hasMane;

    public Lion(String sex, Predator predator) throws Exception {
        this.predator = predator;
        this.hasMane = "Самец".equals(sex);
    }

    public int getKittens() {
        return 1;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        throw new UnsupportedOperationException("Метод не реализован");
    }
}