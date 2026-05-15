package com.example;

import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CatTest {

    private Feline feline;
    private Cat cat;

    @BeforeEach
    void setUp() {
        feline = mock(Feline.class);
        cat = new Cat(feline);
    }

    @Test
    void getSoundReturnsCorrectSound() {
        String expectedSound = "Мяу";
        when(feline.getFamily()).thenReturn("Кошачьи");

        assertEquals(expectedSound, cat.getSound());
    }

    @Test
    void getFoodReturnsCorrectFoodList() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);

        assertEquals(expectedFood, cat.getFood());
    }
}