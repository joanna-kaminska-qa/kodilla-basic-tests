package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void testSurfaceArea() {
        // Given
        Square square = new Square(4); // Przyjmujemy bok 4

        // When
        double surfaceArea = square.surfaceArea(); // Obliczamy powierzchnię

        // Then
        double expectedSurfaceArea = 4 * 4; // Oczekiwana powierzchnia
        Assertions.assertEquals(expectedSurfaceArea, surfaceArea);
    }

    @Test
    void testCircumference() {
        // Given
        Square square = new Square(4); // Przyjmujemy bok 4

        // When
        double circumference = square.circumference(); // Obliczamy obwód

        // Then
        double expectedCircumference = 4 * 4; // Oczekiwany obwód
        Assertions.assertEquals(expectedCircumference, circumference);
    }
}
