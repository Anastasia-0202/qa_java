package com.example;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    @Test
    public void getFamily_IsCorrect() {
        String expectedFelineFamilyName = "Кошачьи";
        Feline feline = new Feline();

        assertEquals(expectedFelineFamilyName, feline.getFamily());
    }

    @Test
     void getKittens_DefaultIsCorrect() {
        int expectedCount = 3; // соответствует реализации Feline.getKittens()
        Feline feline = new Feline();

        assertEquals(expectedCount, feline.getKittens());
    }

    @Test
     void eatMeat_IsCorrect() throws Exception {
        Feline feline = new Feline();
        List<String> expectedMeat = List.of("Говядина", "Курица", "Рыба");

        assertEquals(expectedMeat, feline.eatMeat());
    }

    @Test
    void getFood_ForCarnivore_IsCorrect() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedFood, feline.getFood("Хищник"));
    }

    @Test
     void getFood_ForHerbivore_IsCorrect() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Трава", "Различные растения");

        assertEquals(expectedFood, feline.getFood("Травоядное"));
    }

    @Test
     void getFood_WithUnknownType_ThrowsException() {
        Feline feline = new Feline();

        assertThrows(IllegalArgumentException.class, () -> {
            feline.getFood("Неизвестный тип");
        });
    }
}