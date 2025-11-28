package com.kodilla.abstracts;
import org.junit.jupiter.api.Test;

public class AnimalProcessorTest {

    @Test
    void testProcess() {
        // Given
        Animal dog = new Dog();
        Animal duck = new Duck();
        AnimalProcessor processor = new AnimalProcessor();


        processor.process(dog);
        processor.process(duck);
    }
}
