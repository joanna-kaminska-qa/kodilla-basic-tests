package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void testSurfaceArea() {
        // Given
        Circle circle = new Circle(5); // Przyjmujemy promień 5

        // When
        double surfaceArea = circle.surfaceArea(); // Obliczamy powierzchnię

        // Then
        double expectedSurfaceArea = 3.14 * 5 * 5; // Oczekiwana powierzchnia
        Assertions.assertEquals(expectedSurfaceArea, surfaceArea, 0.01); // Porównujemy z dopuszczalnym marginesem błędu
    }

    @Test
    void testCircumference() {
        // Given
        Circle circle = new Circle(5); // Przyjmujemy promień 5

        // When
        double circumference = circle.circumference(); // Obliczamy obwód

        // Then
        double expectedCircumference = 2 * 3.14 * 5; // Oczekiwany obwód
        Assertions.assertEquals(expectedCircumference, circumference, 0.01); // Porównujemy z dopuszczalnym marginesem błędu
    }
}
