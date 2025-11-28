package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

public class DogTest {

    @Test
    void testGiveVoice() {
        // Given
        Dog dog = new Dog();
        AnimalProcessor processor = new AnimalProcessor();

        // When
        processor.process(dog);
    }
}
