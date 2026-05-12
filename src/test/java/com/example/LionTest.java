package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    @Test
    public void createLion_ExpectedException() {
        Predator mockPredator = mock(Predator.class);
        assertThrows(Exception.class, () -> new Lion("Не определено", mockPredator));
    }

    @Test
    public void getKittens_IsCorrect() throws Exception {
        Predator mockPredator = mock(Predator.class);

        when(mockPredator.getKittens()).thenReturn(5);

        Lion lion = new Lion("Самец", mockPredator);
        int expectedCount = 5;

        assertEquals(expectedCount, lion.getKittens());
    }

    @Test
    public void getFood_IsCorrect() throws Exception {
        // Создаём мок
        Predator mockPredator = mock(Predator.class);

        when(mockPredator.getFood("Хищник")).thenReturn(List.of("Пища"));

        Lion lion = new Lion("Самка", mockPredator);
        List<String> expectedListOfFood = List.of("Пища");

        assertEquals(expectedListOfFood, lion.getFood());
    }
}