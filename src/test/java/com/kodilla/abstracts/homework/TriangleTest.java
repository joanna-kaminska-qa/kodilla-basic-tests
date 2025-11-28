package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void testSurfaceArea() {
        // Given
        Triangle triangle = new Triangle(4, 3, 5, 3); // Przyjmujemy odpowiednie wartości

        // When
        double surfaceArea = triangle.surfaceArea(); // Obliczamy powierzchnię

        // Then
        double expectedSurfaceArea = 0.5 * 4 * 3; // Oczekiwana powierzchnia
        Assertions.assertEquals(expectedSurfaceArea, surfaceArea);
    }

    @Test
    void testCircumference() {
        // Given
        Triangle triangle = new Triangle(4, 3, 5, 3); // Przyjmujemy odpowiednie wartości

        // When
        double circumference = triangle.circumference(); // Obliczamy obwód

        // Then
        double expectedCircumference = 4 + 3 + 5; // Oczekiwany obwód
        Assertions.assertEquals(expectedCircumference, circumference);
    }
}
