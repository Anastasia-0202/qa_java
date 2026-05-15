package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class LionParameterizedTest {

    static Stream<Arguments> setSexForLion() {
        return Stream.of(
                Arguments.of("Самец", true),
                Arguments.of("Самка", false)
        );
    }

    @ParameterizedTest(name = "Класс Lion. Пол: {0}")
    @MethodSource("setSexForLion")
    @DisplayName("Проверка наличия гривы у льва")
    public void doesHaveMane_IsCorrect(String sex, boolean expectedHasMane) throws Exception {
        Predator mockPredator = mock(Predator.class);
        Lion lion = new Lion(sex, mockPredator);

        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}