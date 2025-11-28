package com.kodilla.abstracts;
import org.junit.jupiter.api.Test;

public class DuckTest {

    @Test
    void testGiveVoice() {
        // Given
        Duck duck = new Duck();
        AnimalProcessor processor = new AnimalProcessor();

        // When
        processor.process(duck);
    }
}
