package com.example;

import java.util.List;

public abstract class Animal {
    public abstract String getFamily();

     List<String> getFood(String animalKind) throws Exception {
        switch (animalKind) {
            case "Травоядное":
                return List.of("Трава", "Различные растения");
            case "Хищник":
                return List.of("Животные", "Птицы", "Рыба");
            default:
                throw new IllegalArgumentException(
                        "Неизвестный вид животного, используйте значение Травоядное или Хищник"
                );
        }
    }
}