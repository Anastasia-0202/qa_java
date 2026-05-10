package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;
//
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LionTest {

    @Test
    public void createLion_ExpectedException() {
        assertThrows(Exception.class, () -> new Lion("Не определено"));
    }

    @Test
    public void getKittens_IsCorrect() throws Exception {
        Lion lion = new Lion("Самец");
        int expectedCount = 5;

        assertEquals(
                expectedCount,
                lion.getKittens()
        );
    }

    @Test
    public void getFood_IsCorrect() throws Exception {
        Lion lion = new Lion("Самка");
        List<String> expectedListOfFood = List.of("Пища");

        assertEquals(
                expectedListOfFood,
                lion.getFood()
        );
    }
}