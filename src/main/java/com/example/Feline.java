package com.example;

import java.util.Arrays;
import java.util.List;

public class Feline extends Animal implements Predator {

    // Конструктор без параметров
    public Feline() {}

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens() {
        return 3;
    }

    @Override
    public List<String> getFood(String type) throws Exception {
        return super.getFood(type);
    }

    @Override
    public List<String> eatMeat() throws Exception {
        return Arrays.asList("Говядина", "Курица", "Рыба");
    }
}